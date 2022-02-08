def getCommon( s1, s2):
    MAX_CHAR = 256
    out =[]
    a1 = [0 for i in range(MAX_CHAR)]
    a2 = [0 for i in range(MAX_CHAR)]
 
    length1 = len(s1)
    length2 = len(s2)
 
    for i in range(0,length1):
        a1[ord(s1[i]) - ord('a')] += 1
 
    for i in range(0,length2):
        a2[ord(s2[i]) - ord('a')] += 1

    for i in range(0,MAX_CHAR):
        if (a1[i] != 0 and a2[i] != 0):
             
            for j in range(0,min(a1[i],a2[i])):
                ch = chr(ord('a')+i)
                out.append(ch)
                # print(out)
    return out


def main():

    inarr = input()
    # inarr = ["acquires","fact","layers","magnitude","icons","an"]
    # inarr = ["yawns", "bigmouthed"]

    outarr = []

    for i in range(0,len(inarr)):
        for j in range(0,len(inarr)):
            if((len(inarr[i]*2)) == len(inarr[j])):
                out = getCommon(inarr[i],inarr[j])
                outarr += out
            
    if(len(outarr) == 0):
        print(-1)
    else:
        sorted(outarr)
        for p in range (0,len(outarr)-1):
            print(outarr[p] , end=",")
        print(outarr[-1])
main()
