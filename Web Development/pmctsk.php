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
    <title>PMC</title>
</head>
<body style="background:lightgreen">
<script src="script\js.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>
    <center><h4 style="color:red">PMC UPDATION</h4></center>
        <form action="tsk.php">
            <?php
            $select= $_GET['tsk'];
            $reasonval= $_GET['select'];
            //echo $select;
            $sql="select task_entry. tskname,status, pmc_entry. completedtsk,startdate::date,enddate::date
            from task_entry
            join pmc_entry on
            pmc_entry.id = task_entry.id
            where task_entry.id='$select'";
            $ret=pg_query($db,$sql);
            $rows=pg_fetch_array($ret);
                echo "<center>";
                echo "<form method='POST' action='tsk.php'>";
                echo "<hr style='height:5px;background-color:black;'>";
                echo "<label>TSK NAME:</label><p>$rows[0]</p><br>";
                echo "<label>Status:</label><p>$rows[1]</p><br>";
                echo "<label>Previous Completed Task Percent:</label><p>$rows[2]</p><br>";
                echo "<label>StartDate:</label><p>$rows[3]</p><br>";
                echo "<label>EndDate:</label><p>$rows[4]</p><br>";
                echo "<label>Reason:</label><p id='pmcreason'>$reasonval</p>";
                echo "<input type='submit' value='save'onclick='window.location=('tsk.php');'>";
                echo "<input type='reset' value='reset'>";
                echo "</center>";
                echo "</form>";
                echo "<hr style='height:5px;background-color:black;'>";
            ?>
        </form>    
</body>


</html>