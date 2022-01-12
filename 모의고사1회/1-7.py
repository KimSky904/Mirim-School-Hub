def solution(file_info) :
    sucess = 0
    fail = 0
    for f in file_info :
        splited = f.split(",")
        if splited[0]=="jpeg" and int(splited[len(splited)-1])<1000 :
            sucess += 1
        else : 
            fail += 1
    return sucess,fail


print(solution(["jpeg,all.jpg,1500","mpeg,all.mpg,500"]))