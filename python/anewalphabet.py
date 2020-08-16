"""
Solution for https://open.kattis.com/problems/anewalphabet/
"""
import sys

dict = {
    'a': '@',
    'b': '8',
    'c': '(',
    'd': '|)',
    'e': '3',
    'f': '#',
    'g': '6',
    'h': '[-]',
    'i': '|',
    'j': '_|',
    'k': '|<',
    'l': '1',
    'm': '[]\\/[]',
    'n': '[]\\[]',
    'o': '0',
    'p': '|D',
    'q': '(,)',
    'r': '|Z',
    's': '$',
    't': '\'][\'',
    'u': '|_|',
    'v': '\\/',
    'w': '\\/\\/',
    'x': '}{',
    'y': '`/',
    'z': '2'
}

line = sys.stdin.readline()

new_word = ''
for c in line.lower():
    if c in dict:
        new_word += dict[c]
    else:
        new_word += c

print(new_word)