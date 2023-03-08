<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>INSERT</title>
        <style>
            .fs{
                width: 550px;
                height:450px;
                text-align: center;
                background-color:none;
                border-radius:30px;
                margin: auto;
                margin-top:auto;
            }
            .bg{
                background-image:url(pic.jpg);
                background-size:cover;
            }
            .txtbox{
                margin-top: 10px;
                background:white;
                text-align:start;
                font-size: 15px;
                font-family: sans-serif;
                height: 3px;
                width: 300px;
                padding: 15px;
                border-radius: 15px;
                box-shadow: 0 2px 0 black;    
            }
            .txtbox:hover{
                background-color:lightgreen;
            }
            .btn{
                width: 340px;
                height: 35px;
                border-radius: 15px;
                font-size: 20px;
                background-color:bisque;
               
            }

        </style>

        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="">
    </head>
    <body class="bg">
        <div class="fs">
            <h1>Insert data into database</h1>
            <form method="POST" action="insdata.php">
                <input type="text" class="txtbox" name="name" required placeholder="Enter Name"><br><br>
                <input type="password" class="txtbox" name="pwd" required placeholder="Password"><br><br>
                <input type="email" class="txtbox" name="email" required placeholder="Enter email"><br><br>
                <input type="text" class="txtbox" name="address" required placeholder="Enter Address"><br><br>
                <input type="text" class="txtbox" name="phno" required placeholder="Enter PhoneNo"><br><br>
                <input type="submit" class="btn" name="submit" value="insert data"><br>
            </form>
        </div>
    </body>
</html>
<?php
$host        = "host=localhost";
$port        = "port=5432";
$dbname      = "dbname = mydb";
$credentials = "user = postgres password=thapa123";
$db = pg_connect("$host $port $dbname $credentials");

if(isset($_POST["submit"])){
    $name=$_POST["name"];
    $email=$_POST["email"];
    $password=$_POST["pwd"];
    $address=$_POST["address"];
    $phone=$_POST["phno"];

    $sql ="INSERT INTO emp(name,email,password,address,phoneno)VALUES('$name','$email','$password','$address',$phone)"; 
    $ret=pg_query($db,$sql);
    if($ret){
        echo '<script type="text/javascript"> alert("Data Inserted")</script>';
    }
    else{
        echo '<script type="text/javascript"> alert("Couldnt Inser Data")</script>';
    }
}
?>