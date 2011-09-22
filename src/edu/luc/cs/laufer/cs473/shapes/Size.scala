package edu.luc.cs.laufer.cs473.shapes

object Size {
  def size(s: Shape): Int = s match {
    case Rectangle(_, _) =>
      return 1
    case Location(x, y, shape) => shape match {
      case Rectangle(_, _) =>
        return 1
      case Ellipse(m ,k) =>
        return 1
      case Location(x, y, shape) =>
        size(shape)
      case Group(shapes @ _*) =>
        val shaper = List(shapes:_*)
        shaper.foldLeft(0)((i,s) => i + size(s))
    }
    case Ellipse(m ,k) =>
      return 1
    case Group(shapes @ _*) =>
      val shaper = List(shapes:_*)
      shaper.foldLeft(0)((i,s) => i + size(s))
  }
}

