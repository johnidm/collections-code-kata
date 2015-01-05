import System.IO
import System.Directory
import Data.List

main = do 
  handle <- openFile "todo.txt" ReadMode
  temdir <- getTemporaryDirectory
  (tempName, tempHandle) <- openTempFile tempdir "temp"
  contents <- hGetContents handle
  let todoTasks = line contents
:wq

  
