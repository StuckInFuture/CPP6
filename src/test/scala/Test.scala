package list_product


import org.scalatest.FunSuite
import list_product.ListProduct


class Test extends FunSuite {
  test("StringProduct.entrySymbol"){
    assert(ListProduct.getLists(List(3,-1,2,5,7,-9)) == (List(-1,-9), List(3,2,5,7)))
  }
}
