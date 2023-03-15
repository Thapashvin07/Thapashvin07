<?php

class Database {
    public $host;
    public $port;
    public $dbname;
    public $user;
    public $password;

function connect($host,$port,$dbname,$user,$password){
        $connection_string = ("host=$host port=$port dbname=$dbname user=$user password=$password");
        $dbconn = pg_connect($connection_string);
        if(!$dbconn){
            echo"<h4>Error:Unable to connect Database</h4>";
        }     
        else{
            echo"<h4>Database Connected Successfully!</h4>";
        }
        return $dbconn;
	}
}
    class query extends database{
        public function getData($table,$field_arr='',$condition_arr='',$order_by_field='',$order_by_type='',$limit=''){
            if($field_arr!=''){
                $str=join(",",$field_arr);
                $sql="select $str from $table";        
            }        
            if($condition_arr!=''){
                $sql.=' where ';
                $c=count($condition_arr);	
                $i=1;
                foreach($condition_arr as $key=>$val){
                    if($i==$c){
                        $sql.="$key='$val'";
                    }else{
                        $sql.="$key='$val' and ";
                    }
                    $i++;
                }
            }
            if($order_by_field!=''){
                $sql.=" order by $order_by_field $order_by_type ";
            }
            
            if($limit!=''){
                $sql.=" limit $limit ";
            }
            echo $sql;
        
           $result=pg_query($sql);
            if(pg_num_rows($result)>0){
                echo "<h4><bR>".pg_affected_rows($result)." row(s) affected<h4>";
                $arr=array();
                while($row=pg_fetch_assoc($result)){
                    $arr[]=$row;
                }
                return $arr;
            }else{
                return 0;
            }
        }
        
        public function insertData($table,$condition_arr){
            if($condition_arr!=''){
                foreach($condition_arr as $key=>$val){
                    $fieldArr[]=$key;
                    $valueArr[]=$val;
                }
                $field=implode(",",$fieldArr);
                $value=implode("','",$valueArr);
                $value="'".$value."'";			
                $sql="insert into $table($field) values($value) ";
                echo $sql;
                $result=pg_query($sql);
            }
        }
        public function createTB($table,$condition_arr=''){
        if($condition_arr!=''){
            $res = '';
            foreach($condition_arr as $fd){
                $res= $res.key($condition_arr)." ".$fd.",";
                $ignore=next($condition_arr);
        }
       
    }
		$res=rtrim($res,",");
        $sql="CREATE TABLE $table ($res);";
        echo $sql;
        $result=pg_query($sql);
        }
        
        public function deleteData($table,$condition_arr){
            if($condition_arr!=''){
                $sql="delete from $table where ";
                $c=count($condition_arr);	
                $i=1;
                foreach($condition_arr as $key=>$val){
                    if($i==$c){
                        $sql.="$key='$val'";
                    }else{
                        $sql.="$key='$val' and ";
                    }
                    $i++;
                }
                echo $sql;
                $result=pg_query($sql);
            }
        }
        public function updateData($table,$condition_arr,$where_field,$where_value){
            if($condition_arr!=''){
                $sql="update $table set ";
                $c=count($condition_arr);	
                $i=1;
                foreach($condition_arr as $key=>$val){
                    if($i==$c){
                        $sql.="$key='$val'";
                    }else{
                        $sql.="$key='$val', ";
                    }
                    $i++;
                }
                $sql.=" where $where_field='$where_value' ";
                echo $sql;
                $result=$this->pg_query($sql);
            }
        }
    
    
    }

?>