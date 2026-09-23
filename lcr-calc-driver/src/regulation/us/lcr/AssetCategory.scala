package regulation.us.lcr

/** Generated based on US.LCR.AssetCategory
*/
object AssetCategory{

  final case class AssetCategory(
    arg1: regulation.us.lcr.AssetCategory.Category,
    arg2: morphir.sdk.Basics.Int,
    arg3: morphir.sdk.Basics.Bool
  ){}
  
  sealed trait Category {
  
    
  
  }
  
  object Category{
  
    case object Agency extends regulation.us.lcr.AssetCategory.Category{}
    
    case object CentralBank extends regulation.us.lcr.AssetCategory.Category{}
    
    case object Commodities extends regulation.us.lcr.AssetCategory.Category{}
    
    case object Debt extends regulation.us.lcr.AssetCategory.Category{}
    
    case object Equity extends regulation.us.lcr.AssetCategory.Category{}
    
    case object GovernmentSponsoredEntity extends regulation.us.lcr.AssetCategory.Category{}
    
    case object InvestmentGrade extends regulation.us.lcr.AssetCategory.Category{}
    
    case object LetterOfCredit extends regulation.us.lcr.AssetCategory.Category{}
    
    case object Loan extends regulation.us.lcr.AssetCategory.Category{}
    
    case object NonInvestmentGrade extends regulation.us.lcr.AssetCategory.Category{}
    
    case object Other extends regulation.us.lcr.AssetCategory.Category{}
    
    case object Property extends regulation.us.lcr.AssetCategory.Category{}
    
    case object Sovereigns extends regulation.us.lcr.AssetCategory.Category{}
  
  }
  
  val Agency: regulation.us.lcr.AssetCategory.Category.Agency.type  = regulation.us.lcr.AssetCategory.Category.Agency
  
  val CentralBank: regulation.us.lcr.AssetCategory.Category.CentralBank.type  = regulation.us.lcr.AssetCategory.Category.CentralBank
  
  val Commodities: regulation.us.lcr.AssetCategory.Category.Commodities.type  = regulation.us.lcr.AssetCategory.Category.Commodities
  
  val Debt: regulation.us.lcr.AssetCategory.Category.Debt.type  = regulation.us.lcr.AssetCategory.Category.Debt
  
  val Equity: regulation.us.lcr.AssetCategory.Category.Equity.type  = regulation.us.lcr.AssetCategory.Category.Equity
  
  val GovernmentSponsoredEntity: regulation.us.lcr.AssetCategory.Category.GovernmentSponsoredEntity.type  = regulation.us.lcr.AssetCategory.Category.GovernmentSponsoredEntity
  
  val InvestmentGrade: regulation.us.lcr.AssetCategory.Category.InvestmentGrade.type  = regulation.us.lcr.AssetCategory.Category.InvestmentGrade
  
  val LetterOfCredit: regulation.us.lcr.AssetCategory.Category.LetterOfCredit.type  = regulation.us.lcr.AssetCategory.Category.LetterOfCredit
  
  val Loan: regulation.us.lcr.AssetCategory.Category.Loan.type  = regulation.us.lcr.AssetCategory.Category.Loan
  
  val NonInvestmentGrade: regulation.us.lcr.AssetCategory.Category.NonInvestmentGrade.type  = regulation.us.lcr.AssetCategory.Category.NonInvestmentGrade
  
  val Other: regulation.us.lcr.AssetCategory.Category.Other.type  = regulation.us.lcr.AssetCategory.Category.Other
  
  val Property: regulation.us.lcr.AssetCategory.Category.Property.type  = regulation.us.lcr.AssetCategory.Category.Property
  
  val Sovereigns: regulation.us.lcr.AssetCategory.Category.Sovereigns.type  = regulation.us.lcr.AssetCategory.Category.Sovereigns
  
  def a0Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(0),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def a1Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def a2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def a2Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def a3: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def a3Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def a4: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def a4Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def a5: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(5),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def a5Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Agency : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(5),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def c1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Commodities : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def cB1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.CentralBank : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def cB1Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.CentralBank : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def cB2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.CentralBank : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def cB2Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.CentralBank : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def cB3: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.CentralBank : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def cB3Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.CentralBank : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def cB4: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.CentralBank : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e1Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e10: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(10),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e2Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e3: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e4: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e5: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(5),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e6: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(6),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e7: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(7),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e8: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(8),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def e9: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Equity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(9),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def g1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.GovernmentSponsoredEntity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def g1Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.GovernmentSponsoredEntity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def g2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.GovernmentSponsoredEntity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def g2Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.GovernmentSponsoredEntity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def g3: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.GovernmentSponsoredEntity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def g3Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.GovernmentSponsoredEntity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def g4: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.GovernmentSponsoredEntity : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def hQLALevel1: morphir.sdk.List.List[regulation.us.lcr.AssetCategory.AssetCategory] =
    morphir.sdk.List(
      regulation.us.lcr.AssetCategory.a0Q,
      regulation.us.lcr.AssetCategory.a1Q,
      regulation.us.lcr.AssetCategory.a2Q,
      regulation.us.lcr.AssetCategory.a3Q,
      regulation.us.lcr.AssetCategory.a4Q,
      regulation.us.lcr.AssetCategory.a5Q,
      regulation.us.lcr.AssetCategory.s1Q,
      regulation.us.lcr.AssetCategory.s2Q,
      regulation.us.lcr.AssetCategory.s3Q,
      regulation.us.lcr.AssetCategory.s4Q,
      regulation.us.lcr.AssetCategory.cB1Q,
      regulation.us.lcr.AssetCategory.cB2Q
    )
  
  def hQLALevel1ExcludingCash: morphir.sdk.List.List[regulation.us.lcr.AssetCategory.AssetCategory] =
    morphir.sdk.List.filter(((assetCategory: regulation.us.lcr.AssetCategory.AssetCategory) =>
      morphir.sdk.Basics.notEqual(assetCategory)(regulation.us.lcr.AssetCategory.a0Q)))(regulation.us.lcr.AssetCategory.hQLALevel1)
  
  def hQLALevel2A: morphir.sdk.List.List[regulation.us.lcr.AssetCategory.AssetCategory] =
    morphir.sdk.List(
      regulation.us.lcr.AssetCategory.g1Q,
      regulation.us.lcr.AssetCategory.g2Q,
      regulation.us.lcr.AssetCategory.g3Q,
      regulation.us.lcr.AssetCategory.s5Q,
      regulation.us.lcr.AssetCategory.s6Q,
      regulation.us.lcr.AssetCategory.s7Q,
      regulation.us.lcr.AssetCategory.cB3Q
    )
  
  def hQLALevel2B: morphir.sdk.List.List[regulation.us.lcr.AssetCategory.AssetCategory] =
    morphir.sdk.List(
      regulation.us.lcr.AssetCategory.e1Q,
      regulation.us.lcr.AssetCategory.e2Q,
      regulation.us.lcr.AssetCategory.iG1Q,
      regulation.us.lcr.AssetCategory.iG2Q
    )
  
  def hQLAUnwindTransactions: morphir.sdk.List.List[regulation.us.lcr.AssetCategory.AssetCategory] =
    morphir.sdk.List.concat(morphir.sdk.List(
      regulation.us.lcr.AssetCategory.hQLALevel1,
      regulation.us.lcr.AssetCategory.hQLALevel2A,
      regulation.us.lcr.AssetCategory.hQLALevel2B
    ))
  
  def iG1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def iG1Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def iG2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def iG2Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def iG3: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def iG4: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def iG5: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(5),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def iG6: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(6),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def iG7: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(7),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def iG8: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.InvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(8),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l10: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(10),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l11: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(11),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l12: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(12),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l3: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l4: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l5: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(5),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l6: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(6),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l7: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(7),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l8: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(8),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def l9: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Loan : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(9),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def lC1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.LetterOfCredit : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def lC2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.LetterOfCredit : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def memberOf(
    list: morphir.sdk.List.List[regulation.us.lcr.AssetCategory.AssetCategory]
  )(
    item: regulation.us.lcr.AssetCategory.AssetCategory
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(item)(list)
  
  def n1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.NonInvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def n2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.NonInvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def n3: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.NonInvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def n4: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.NonInvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def n5: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.NonInvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(5),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def n6: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.NonInvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(6),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def n7: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.NonInvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(7),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def n8: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.NonInvestmentGrade : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(8),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def p1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Property : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def p2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Property : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s1Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s2Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s3: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s3Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s4: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s4Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s5: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(5),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s5Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(5),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s6: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(6),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s6Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(6),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s7: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(7),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s7Q: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(7),
      true
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def s8: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Sovereigns : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(8),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def y1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Debt : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def y2: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Debt : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(2),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def y3: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Debt : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(3),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def y4: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Debt : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(4),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)
  
  def z1: regulation.us.lcr.AssetCategory.AssetCategory =
    (regulation.us.lcr.AssetCategory.AssetCategory(
      (regulation.us.lcr.AssetCategory.Other : regulation.us.lcr.AssetCategory.Category),
      morphir.sdk.Basics.Int(1),
      false
    ) : regulation.us.lcr.AssetCategory.AssetCategory)

}