from turtle import *
from random import*

tracer(0)
a = Turtle()
b = Turtle()


def createA():
  a.goto(randint(-200,150), randint(-200,150))
  a.fillcolor(randint(0,255), randint(0,255), randint(0,255))
  a.begin_fill()
  a.setheading(0)
  a.pendown()
  a.left(90)
  a.forward(150)
  a.right(45)
  a.forward(150)
  a.left(90)
  a.forward(150)
  a.left(90)
  a.forward(150)
  a.right(-90)
  a.forward(150)
  a.end_fill()
  a.right(225)
  a.forward(215)
  a.left(135)
  a.forward(155)
  a.right(-135)
  a.forward(6)
  a.forward(215)
  a.penup()


for i in range(5):
  a.penup()
  a.goto(randint(-400,0), randint(-400, 0))
  a.left(90)
  createA()

def createB():
  b.fillcolor(randint(0,255), randint(0,255), randint(0,255))
  b.begin_fill()
  b.setheading(0)
  b.pendown()
  b.left(90)
  for i in range(180):
    b.forward(1)
    b.right(1)
  b.right(90)
  b.forward(115)
  b.penup()
  b.right(180)
  b.forward(60)
  b.right(90)
  b.end_fill()
  b.pendown()
  b.forward(90)
  b.penup()
  b.goto(999,999)

for i in range(5):
  b.penup()
  b.goto(randint(-400,0), randint(-400, 0))
  b.left(90)
  createB()


update()

