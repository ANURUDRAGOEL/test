$param1=$args[0]
write-host $param1 
Write-Host "Hello, World!"
New-Item -Path . -Name "testfile1.txt" -ItemType "file" -Value "This is a text string."
compress-archive -path "$param1" -destinationpath "$param1\logs.zip" -update -compressionlevel optimal
