package edu.luc.cs.laufer.cs473.shapes

abstract class Shape

case class Rectangle(width: Int, height: Int) extends Shape {
  if(width <= 0) {
     throw new IllegalArgumentException("negative or nonexistent size")
  } 
  if (height <= 0) {
     throw new IllegalArgumentException("negative or nonexistent size")
  }
 }

case class Location(x: Int, y: Int, shape: Shape) extends Shape {
  if (shape == null) {
    throw new IllegalArgumentException("null shape in location")
  }
}

case class Ellipse(majorR: Int, minorR: Int) extends Shape {
  if(majorR <= 0) {
     throw new IllegalArgumentException("negative or nonexistent size")
  } 
  if (minorR <= 0) {
     throw new IllegalArgumentException("negative or nonexistent size")
  }
 }

case class Group(shape: Shape*) extends Shape {
  shape.foreach(shape => if (shape == null) {
    throw new IllegalArgumentException("null shape in group")
  }
  )
}

