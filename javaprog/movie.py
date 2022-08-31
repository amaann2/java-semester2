action_m = ["Shawshank Redemption","Die hard","Red","John wick","The hobbit","Lord of the rings","Batman","Superman","Ironman",
                "Spiderman","Antman","Thor","Black widow","Captain America","The matrix"]
horror_m = ["Us","A quiet place","Get out","The invisible man","Psycho","Freaks","Halloween","Aliens","Host",
            "Bride of Frankenstein","The Badadook","IT","It follows","The lighthouse","Hereditary"]
comedy_m = ["meet the parents","Mean girls","Pulp fiction","Hot fuzz","Safety last","walk hard","Local hero","The philadelphia story",
            "harold and maude","The Heartbreak Kid","Scrooged","Groundhog day","Zombieland","The truman show","Ted"]

action_t =["Vikings","Game of thrones","NCIS","Snowpiercer","Reacher","Daredevil","The last Kingdom","The boys","Arcane","Cobra kai",
            "Chicago Fire","The wheel of time","Money heist","Vikings: Valhalla","Titans"]
horror_t =["Are you afraid of the dark","The haunting of hill house","The vampire diaries","tales from the crypt","The outer limits","Kolchak","Ghost hunters",
            "Ash vs evil dead","The returned","Dark shadows","True blood","Masters of horrors","Alfred hitchock presents","A haunting","Penny dreadful"]
comedy_t =["Peacemaker","The office","Dollface","Murderville","Seinfield","Freinds","How i met your mother","Space force","This is us","After life",
            "Resident Alien","The big bang theory","Cobra kai","Castle","Southpark",]

def movie(type,type2,type3,type4):

        #for x in range (0,100):
        while(True):
            if(type=="M"):
                if(type2=="H"):
                    if(type3 < 0 or type3 > 15):
                        print("Invalid number\n")
                    else:
                        print(horror_m[type3-1])
                if(type2=="C"):
                    if(type3 < 0 or type3 > 15):
                        print("Invalid number\n")
                    else:
                        print(comedy_m[type3-1])
                if(type2=="A"):
                    if(type3 < 0 or type3 > 15):
                        print("Invalid number\n")
                    else:
                        print(action_m[type3-1])

            elif(type == "T"):
                if(type2 =="C"):
                    if(type3 < 0 or type3 > 15):
                        print("Invalid number\n")
                    else:
                        print(comedy_t[type3-1])
                if(type2=="A"):
                    if(type3 < 0 or type3 > 15):
                        print("Invalid number\n")
                    else:
                        print(action_t[type3-1])
                if(type2=="H"):
                    if(type3 < 0 or type3 > 15):
                        print("Invalid number\n")
                    else:
                        print(horror_t[type3-1])
            else:
                print("Invalid input")   



print("Welcome to my program")
type = input("Please select (M)ovies or (T)Vshows\n")
type2 = input("Please choose a genre (H)orror,(C)omedy,(A)ction\n")
type3 = int(input("Please choose a number between 1 to 15\n"))
type4 = input("Are you satisfied ? (Y)es or (N)o\n")
movie(type,type2,type3,type4)
if(type4=="Y"):
    print("Program ended Succesfully\n")
elif(type4=="N"):
    movie(type,type2,type3,type4)
else:
    print("Invalid Input\n")