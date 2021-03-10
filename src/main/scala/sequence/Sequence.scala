package sequence

object Sequence {

	def length(arr: List[Int]): Int = arr match {
		case Nil => 0
		case head :: tail => 1 + length(tail)
	}

	def mapToAbsolute(arr:List[Int]):List[Int] = ???

}

