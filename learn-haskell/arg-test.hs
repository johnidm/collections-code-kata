import System.Environment
import Data.List

main = do
  args <- getArgs
  progName <- getProgName
  putStrLn "Os argumentos são: "
  mapM putStrLn args
  putStrLn "O nome do programa é:"
  putStrLn progName




