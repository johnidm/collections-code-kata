--import Control.Monad
import Data.Char

--main = forever $ do
--  putStr "Give me some input :"
--  l <- getLine
--  putStrLn $ map toUpper l


main = do 
  contents <- getContents
  putStr (map toUpper contents)






