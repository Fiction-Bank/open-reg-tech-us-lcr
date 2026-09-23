package regulation.us.fr2052a.fields

/** Generated based on US.FR2052A.Fields.Product
*/
object Product{

  type Product = (regulation.us.fr2052a.fields.Product.SectionCode, regulation.us.fr2052a.fields.Product.TableCode, regulation.us.fr2052a.fields.Product.ProductCode)
  
  type ProductCode = morphir.sdk.Basics.Int
  
  type SectionCode = morphir.sdk.String.String
  
  type TableCode = morphir.sdk.String.String

}