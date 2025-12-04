n = int(input())
num = list(map(int, input().split()))

if len(num) == n:
    print(min(num), max(num))