package sequence

object Sequence {

	def length(arr: List[Int]): Int = arr match {
		case Nil => 0
		case head :: tail => 1 + length(tail)
	}

	def mapToAbsolute(arr: List[Int]): List[Int] = arr match {
		case Nil => Nil
		case head :: tail if head < 0 => -head :: mapToAbsolute(tail)
		case head :: tail => head :: mapToAbsolute(tail)
	}

}

