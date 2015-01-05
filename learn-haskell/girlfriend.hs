import System.IO
import Data.Char


--main = do 
--  handle <- openFile "girlfriend.txt" ReadMode
 -- contents <- hGetContents handle
--  putStr contents 
--  hClose handle

main = do
  contents <- readFile "girlfriend.txt"
  putStr contents
  writeFile "girlfriendcpas.txt" (map toUpper contents)


