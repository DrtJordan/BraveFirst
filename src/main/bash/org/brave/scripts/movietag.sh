
#!/bin/bash
echo "=========================$0 starts!======================"

while read LINE
 do 
 echo ${LINE##*,} >> movietags.txt
done < movies.txt
