<?php
    $host        = "host=localhost";
    $port        = "port=5432";
    $dbname      = "dbname = test";
    $credentials = "user = postgres password=thapa123";
    $db = pg_connect("$host $port $dbname $credentials");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DETAILS</title>
    <script src="script\js.js" defer></script>
<script defer>
document.onkeydown=function(event){
  if(event.keyCode==116 || (event.ctrlKey && event.keyCode==82)  ){
    alert("Refreshing page will erase ur data")
    //event.preventDefault();
  }
}
</script>
    <style>
       
        table,th,td{
            /* margin-top:50px;
            background:lightblue;  */
            width:1200px; 
            text-align:center;
            border: 1px solid black;
        }
        tr:nth-child(even) {
            background-color: #D6EEEE;
        }
        select{
            width:200px;
            padding: 5px 5px 5px 5px;    
        }
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }

        li {
            float: left;
        }

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover {
            background-color:green ;
        }
        /* .button {
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 15px;
            margin: 2px 2px;
            cursor: pointer;
            width:120px;
        } */
    </style>
</head>
<body>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>
    <center> <h2>DIGITAL ASSISTANCE</h2></center>
<ul>
  <li><a class="active" href="#">DSR</a></li>
  <li><a href="#unplan">Unplanned Task</a></li>
  <li><a href="#alltasks">All tasks</a></li>
  <li><a href="#futuretsk">Future tasks</a></li>
</ul><br>
    <center>
        
        <table style=" border:2px solid black ">
        <tr>
        <th>Sno</th>
        <th>Button</th> 
        <th>Tsk/bugid</th>
        <th>TaskName</th>
        <th>Status</th>
        <th>Reason</th>
        <th>Remarks</th>
        </tr>  
        <?php
        // $remvalue=($_GET['remarks']);
        // $bgid=($_GET['bug']);  
      
        $sql="select * from task_entry order by tskname";
        $ret=pg_query($db,$sql);
        while($rows=pg_fetch_array($ret)){
            echo "<tr>";
            echo "<td>1</td>";
            $tsk=$rows[0];
            $pattern='/^tsk/i';
            if(preg_match($pattern,$tsk)){
    
                echo "<td><button id='btn'style='background-color:green' onclick='tskchangeval(this)'>Start</button></td>";
                echo "<td style='color:green' id='tid'>".$rows[0]."</td>";
                echo "<td>".$rows[1]."</td>";
                echo "<td>".$rows[2]."</td>";
                echo"<td><select name='treason' id='treason'class='trem' onchange='tsksel(this)'>
                        <option value=''>--NONE--</option>
                        <option value='lunch'>LUNCH</option>
                        <option value='Break'>BREAK</option>
                        <option value='Switch'>SWITCH</option>
                        <option value='Completed'>COMPLETED</option>
                    </select> </td>";
                echo "<td><input type='text' name='tremarks' id='tremarks'></td>";
                echo "</tr>"; 
            }   
            else{
    
                echo "<td><button id='btn'style='background-color:green' onclick='bugchangeval(this)'>Start</button></td>";
                echo "<td style='color:blue' id='bid'>".$rows[0]."</td>";
                echo "<td>".$rows[1]."</td>";
                echo "<td>".$rows[2]."</td>";
                echo"<td>
                    <select name='breason' id='breason' onchange='bugsel(this)'>
                        <option value='' selected>--NONE--</option>
                        <option value='lunch'>LUNCH</option>
                        <option value='Break'>BREAK</option>
                        <option value='Switch'>SWITCH</option>
                        <option value='Completed'>COMPLETED</option>
                    </select> </td>";
                echo "<td><input type='text' name='bremarks' id='bremarks'></td>";
                echo "</tr>"; 

            }
        }
        // $updrem="update task_entry set remarks='$remvalue' where id='$bgid'";
        // echo $remvalue;
        // echo $updrem;
    //     $regpattern='/^tsk/i';
    //    // $bg=$rows[0];
    //      if(!preg_match($regpattern,$rows[0])){  
    //             $updret=pg_query($updrem);
    //             if($updret){
    //                 echo "<script type='text/javascript'>alert('Updated successfully!');</script>";
    //             }
    //     }
        ?> 
        </table>
    </center>
<!-- <script src="script\js.js"></script>
<script>
document.onkeydown=function(event){
  if(event.keyCode==116){
    alert("Refreshing page will erase ur data")
    event.preventDefault();
  }
}
</script> -->
</body>
</html>