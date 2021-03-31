#!/bin/bash
user="root"
pass="123456"
dbname="test_batch"

#export name="$1"
#export code="$2"
#export sex="$3"

name="${1}"
code="${2}"
sex="${3}"

#read name
#read code
#read sex
echo "this is information:"

sql_query1=" insert into sinhvien(tensv,masv,gioitinh) 
values ('$name', '$code' ,'$sex'); "
sql_query2=" select * from sinhvien where tensv = '$name';"

mysql -u $user -p$pass -D $dbname -e "$sql_query1 $sql_query2" 

echo "Insert success !"
#echo "$user $pass $dbname"

#end
