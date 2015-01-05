-- import Data.List
import Data.List (nub, sort)

numUniques :: (Eq a) => [a] -> Int
numUniques = length . nub


encode' :: Int -> String -> String
endoce' shift msg = 
  let ords = map ord msg
      shifted = map (+ shift) ords
  in map chr shifted

 
