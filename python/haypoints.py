import sys


m, n = list(map(int, input().split()))

dictionary = dict()

for i in range(m):
    line = input().split()

    dictionary[line[0]] = int(line[1])

for i in range(n):
    job_sal = 0

    line = input()
    while line is not '.':

        for word in line.split():
            if word in dictionary:
                job_sal += dictionary[word]

        line = input()

    print(job_sal)
