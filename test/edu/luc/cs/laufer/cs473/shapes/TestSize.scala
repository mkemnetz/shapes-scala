package edu.luc.cs.laufer.cs473.shapes

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import Size._
import TestFixtures._

@RunWith(classOf[JUnitRunner])
class TestSize extends FunSuite {

  def testSize(description: String, s: Shape, x: Int) = {
    test(description) {
	  val b = size(s)
	  assert(x === b)
    }
  }


  testSize("simple ellipse", simpleEllipse, 1)
  testSize("simple rectangle", simpleRectangle, 1)
  testSize("basic group", basicGroup, 2)
  testSize("simple group", simpleGroup, 2)
  testSize("complex group", complexGroup, 5)
}
