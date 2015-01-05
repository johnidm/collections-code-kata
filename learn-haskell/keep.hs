import qualified Data.Map as Map

data LockerState = Taken | Free deriving (Show, Eq)

type Code = String

type LockerMap = Map.Map Int (LockerState, Code)

lockerLookup :: Int -> LockerMap -> Either String Code
lockerLookup lockerNumber map = 
   case Map.lookup lockerNumber map of
      Nothing -> Left $ "Locker number " ++ show lockerNumber ++ " doesnt exist!"
      Just(state, code) -> if (state /= Taken) then
                             Right code
                           else 
                             Left $ "Locker " ++ show lockerNumber ++ " is alread" 
		  

lockers :: LockerMap
lockers = Map.fromList
  [(100, (Taken, "ZADD")), (101, (Free, "WEDD"))  ]


