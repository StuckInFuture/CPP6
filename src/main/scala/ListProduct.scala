package list_product


object ListProduct {

  def getLists(currentList: List[Int]): (List[Int], List[Int]) = {

    currentList.partition(_ < 0)

  }

}