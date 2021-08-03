Write-Host "Hello, World!"
New-Item -Path  "$(Build.SourcesDirectory)\testfile1.txt" -ItemType "file" -Value "This is a text string."
compress-archive -path "$(Build.SourcesDirectory)" -destinationpath "$(Build.SourcesDirectory)\logs.zip" -update -compressionlevel optimal
