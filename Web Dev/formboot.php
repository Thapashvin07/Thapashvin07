<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
    <link rel="stylesheet" type="text/css" href="bootstrap.css">
</head>
<body>
    <div class="container vh-100">
        <div class="row justify-content-center h-100 " >
            <div class="card w-40 my-auto shadow">
                <div class="card-header text-center bg-primary text-white">
                    <h4>Login</h3>
                </div>
                <div class="card-body">
                    <form action="formboot.php" method="POST">
                        <div class="form-group">
                            <label for="Email">Email id</label>
                            <input type="email" class="form-control" id="Email" name="email" placeholder="Enter email"required> 
                        </div>
                        <div class="form-group">
                            <label for="Password">Password</label>
                            <input type="password" class="form-control" id="Password" name="password" placeholder=" Enter passsword" required> 
                        </div>
                        <input type="submit" class="btn btn-success w-100" value="Login" name="submit"><br><br>
                        <input type="button" class="btn btn-danger w-100"value="Back" onclick="history.back()">

                    </form>
                </div>
                <div class="card-footer text-right">
                    <small>&copy; Thapash@Editz</small>
                </div>                  
            </div>
        </div>
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
    $password=$_POST["password"];
    $email=$_POST["email"];

    $sql = "select * from signup where email='$email' and password='$password'";
    //echo $sql;
    $ret = pg_query($db,$sql);
        if(pg_fetch_array($ret)>0){
            echo '<script type="text/javascript"> alert("Logged in successfully!")</script>';
        }
        else{
            echo '<script type="text/javascript"> alert("Logged in failed")</script>';
        }
}
?>
