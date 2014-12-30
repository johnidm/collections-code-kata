--oddSquareSum :: Integer
--oddSquareSum = sum . (takeWhile (<10000) . filter odd . map (^2) $ [1..])

--elem'' :: (Ep a) => a -> [a] -> Bool
--elem'' = y ys = foldl (\acc x -> if x == y then True else acc ) False ys


sum'' :: (Num a) => [a] -> a
sum'' xs = foldl (\acc x -> acc + x) 0 xs

sum''' :: (Num a) => [a] -> a
sum''' = foldl (+) 0

chain :: (Integral a) => a -> [a]
chain 1 = [1]
chain n 
  | even n = n:chain (n `div` 2)
  | odd n = n:chain (n * 3 + 1)

numLongChains :: Int
numLongChains = length (filter isLong (map chain [1..100]))
   where isLong xs = length xs > 15

largestyDivisible :: (Integral a) => a
largestyDivisible = head (filter p [100000, 99999..])
  where p x = x `mod` 3892 == 0
 

zipWith' :: (a -> b -> c) -> [a] -> [b] -> [c]
zipWith' _ [] _  = []
zipWith' _ _ [] = []
zipWith' f (x:xs) (y:ys) = f x y : zipWith' f xs ys

flip' :: (a->b->c) -> (b->a->c)
flip' f = g
  where g x y = f y x



applyTwice :: (a -> a) -> a -> a
applyTwice f x = f (f x)


divideByTen :: (Floating a) => a -> a
divideByTen = (/10)


isUpperAlphaNum :: Char -> Bool
isUpperAlphaNum = (`elem` ['A' .. 'Z'])


compareWithHundred :: (Num a, Ord a) => a -> Ordering
compareWithHundred = compare 100

mulThree :: (Num a) => a -> a -> a -> a
mulThree x y z = x * y * z


quicksort :: (Ord a) => [a] -> [a]
quicksort [] =[]
quicksort (x:xs) =
   let smallerSorted = quicksort [a | a <- xs, a <= x]
       biggerSorted = quicksort [a | a <- xs, a > x]
   in smallerSorted ++ [x] ++ biggerSorted
	


elem' :: (Eq a) => a -> [a] -> Bool
elem' a [] = False
elem' a (x:xs)
   | a == x = True
   | otherwise = a `elem'` xs


reverse' :: [a] -> [a]
reverse' [] = [] 
reverse' (x:xs) = reverse' xs ++ [x]

zip' :: [a] -> [b] -> [(a, b)]
zip' _ [] = []
zip' [] _ = []
zip' (x:xs) (y:ys) = (x, y):zip' xs ys

maximum' :: (Ord a) => [a] -> a
maximum' [] = error "maximum of empty list"
maximum' [x] = x
maximum' (x:xs)
    | x > maxTail = x
    | otherwise = maxTail
    where maxTail = maximum' xs
 

replicate' :: (Num i, Ord i) => i -> a -> [a]
replicate' n x
   | n <= 0 = []
   | otherwise = x:replicate' (n-1) x

take' :: (Num i, Ord i) => i -> [a] -> [a]
take' n _ 
    | n <= 0 = []
take' _ [] = []
take' n (x:xs) = x : take' (n-1) xs



doubleMe x = x + x

doubleUs x y = x*2 + y*2

doubleSmallNumber' x = (if x > 100 then x else x * 2) + 1

boomBangs xs = [if x < 10 then "BOOM!" else "BANG!" | x <- xs, odd x]


length' xs = sum [1 | _ <- xs]

removeNonUpperCase :: [Char] -> [Char]
removeNonUpperCase st = [c | c <- st, c `elem` ['A'..'Z']]

addThree :: Int -> Int -> Int -> Int
addThree x y z = x + y + z 

factorial :: Integer -> Integer
factorial n = product [1..n]

circunference :: Float -> Float  
circunference r = 2 * pi * r

circunference' :: Double -> Double  
circunference' r = 2 * pi * r

charName :: Char -> String
charName 'a' = "Albert"
charName 'b' = "Broseph" 
charName 'c' = "Cecil"   

factorial_1 :: Integer -> Integer  
factorial_1 0 = 1  
factorial_1 n = n * factorial (n - 1)

sayMe :: Int -> String
sayMe 1 = "One"
sayMe x = "Not beetween 1 and 5"

addVectors :: (Integral a) => (a, a) -> (a, a) -> (a, a)
addVectors (x1, y1) (x2, y2) = (x1 + x2, y1 + y2)

head' :: [a] -> a 
head' [] = error "Can't call head on an empty list. dummy!"
head' (x:_) = x

tell :: (Show a) => [a] -> String
tell [] = "The list is empty"
tell (x:[]) = "The list has one element " ++ show x 
tell (x:y:[]) = "The list has tow elements " ++ show x ++ " and " ++ show y
tell (x:y:_) = "This list is long. The first two elements are " ++ show x ++ "and" ++ show y


length'' :: (Num b) => [a] -> b
length'' [] = 0
length'' (_:xs) = 1 + length'' xs 


sum' :: (Num a) => [a] -> a
sum' [] = 0
sum' (x:xs) = x + sum' xs

capital :: String -> String 
capital "" = "Empty strins, whoops!"

capital  all@(x:xs) = "The fisrt latter of" ++ all ++ " is " ++ [x]


bmiTell :: (RealFloat a) => a -> String
bmiTell bmi 
    | bmi <= 18.5 = "You're underweight, you emo, you!"
    | bmi <= 25.0 = "You're supposedly normal. Pfffft, I bet you're ugly!"
    | bmi <= 30.0 = "You're fat! Lose some weight, fatty!"
    | otherwise = "You're a whale, congratulations!"

max' :: (Ord a) => a -> a -> a
max' a b
   | a > b = a
   | otherwise = b


myCompare :: (Ord a) => a -> a -> Ordering 
a `myCompare` b
  | a > b = GT
  | a == b = EQ
  | otherwise = LT


--bmiTell' :: (RealFloat a) => a -> a -> String
--bmiTell' weight height 
--  | bmi <= skinny = "Você está magro, você emo, você!"
--  | bmi <= normal = "Você está supostamente normal. Pffft. Eu aposto, você é feio!"
--  | bmi <= fat = "Vocẽ está gordo. Perder algum peso. gordo!"
--  | otherwise = "Você está uma baleia, parabéns!" 
--  where bmi = weight / height ^ 2
--        skinny = 18.5
--        normal = 25.0
--        fat = 30.0

initials :: String -> String -> String 
initials firstname lastname = [f] ++ " . " ++ [l] ++ "."
   where (f:_) = firstname 
         (l:_) = lastname 





head'' :: [a] -> a
head'' xs = case xs of [] -> error "No head for empty lists!"     
                       (x:_) -> x



