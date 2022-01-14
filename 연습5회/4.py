def solution(word) : 
    num2alpha = ["oqz","ij","abc","def","gh","kl","mn","prs","tuv","wxy"]
    answer = ''
    for c in word : 
        for i in range(len(num2alpha)):
            for a in num2alpha : 
                if a == c :
                    answer += str(i)
                    print('!!')
                    break

    return answer


print(solution('bulldog'))