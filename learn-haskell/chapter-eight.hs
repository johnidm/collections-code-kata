data Point = Point Float Float deriving (Show)
data Shape = Circle Point Float | Rectangle Point Point deriving (Show)

surface :: Shape -> Float
surface (Circle _ r) = pi * r ^ 2
surface (Rectangle (Point x1 y1 ) (Point x2 y2)) = (abs $ x2 - x1) * (abs $ y2 - y1)  

nudge :: Shape -> Float -> Float -> Shape
nudge (Circle (Point x y) r) a b = Circle(Point (x+a) (y+b)) r
nudge (Rectangle (Point x1 y1) (Point x2 y2)) a b = Rectangle (Point (x1 + a) (y1 + b)) (Point (x2 + a) (y2 + b))

baseCircle :: Float -> Shape
baseCircle r = Circle (Point 0 0) r

baseRect :: Float -> Float -> Shape
baseRect width height = Rectangle (Point 0 0) (Point width height)

data Person_ = Person_ String String Int Float String String deriving (Show)

--data Person = Person {firstName :: String,
--  lastName :: String,
--  age :: Int,
--  height :: Float,
--  phoneNumber :: String,
--  flavor :: String } deriving (Show)

data Car = Car {company :: String, model :: String, year :: String} deriving (Show)

tellCar :: Car -> String 
tellCar (Car {company = c, model = m, year = y}) = "This " ++ c ++ " " ++ m ++ " was mode in " ++ y

data Vector a = Vector a a a deriving (Show)

vplus :: (Num t) => Vector t -> Vector t -> Vector t
(Vector i j k) `vplus` (Vector l m n) = Vector (i + l) (j + m) (k + n)

vectMult :: (Num t) => Vector t -> t -> Vector t
(Vector i j k) `vectMult` m = Vector (i*m) (j*m) (k*m)

scalarMult :: (Num t) => Vector t -> Vector t -> t
(Vector i j k) `scalarMult` (Vector l m n) = i*l + j*m + k*n 

data PersonEq = PersonEq {firstName :: String, lastName :: String, age :: Int} deriving (Eq, Show, Read)

data Day = Monday | Tuesday | Wednesday | Thursday | Friday | Satuday | Sunday deriving (Eq, Ord, Show, Read, Bounded, Enum)


type PhoneNumber = String
type Name = String
type PhoneBook = [(Name, PhoneNumber)]


 




