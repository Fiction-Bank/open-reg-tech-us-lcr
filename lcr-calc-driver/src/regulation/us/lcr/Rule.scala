package regulation.us.lcr

/** Generated based on US.LCR.Rule
*/
object Rule{

  sealed trait Rule {
  
    
  
  }
  
  object Rule{
  
    case object Rule20A1 extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule20A1C extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule20B1 extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule20C1 extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule21C extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule21D extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule21E extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule21F extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule21G extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule21H extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule21I extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule22A3L1 extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule22A3L2A extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule22A3L2B extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule22B3L1 extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule22B3L2A extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule22B3L2B extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule22B5L1 extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule22B5L2A extends regulation.us.lcr.Rule.Rule{}
    
    case object Rule22B5L2B extends regulation.us.lcr.Rule.Rule{}
  
  }
  
  val Rule20A1: regulation.us.lcr.Rule.Rule.Rule20A1.type  = regulation.us.lcr.Rule.Rule.Rule20A1
  
  val Rule20A1C: regulation.us.lcr.Rule.Rule.Rule20A1C.type  = regulation.us.lcr.Rule.Rule.Rule20A1C
  
  val Rule20B1: regulation.us.lcr.Rule.Rule.Rule20B1.type  = regulation.us.lcr.Rule.Rule.Rule20B1
  
  val Rule20C1: regulation.us.lcr.Rule.Rule.Rule20C1.type  = regulation.us.lcr.Rule.Rule.Rule20C1
  
  val Rule21C: regulation.us.lcr.Rule.Rule.Rule21C.type  = regulation.us.lcr.Rule.Rule.Rule21C
  
  val Rule21D: regulation.us.lcr.Rule.Rule.Rule21D.type  = regulation.us.lcr.Rule.Rule.Rule21D
  
  val Rule21E: regulation.us.lcr.Rule.Rule.Rule21E.type  = regulation.us.lcr.Rule.Rule.Rule21E
  
  val Rule21F: regulation.us.lcr.Rule.Rule.Rule21F.type  = regulation.us.lcr.Rule.Rule.Rule21F
  
  val Rule21G: regulation.us.lcr.Rule.Rule.Rule21G.type  = regulation.us.lcr.Rule.Rule.Rule21G
  
  val Rule21H: regulation.us.lcr.Rule.Rule.Rule21H.type  = regulation.us.lcr.Rule.Rule.Rule21H
  
  val Rule21I: regulation.us.lcr.Rule.Rule.Rule21I.type  = regulation.us.lcr.Rule.Rule.Rule21I
  
  val Rule22A3L1: regulation.us.lcr.Rule.Rule.Rule22A3L1.type  = regulation.us.lcr.Rule.Rule.Rule22A3L1
  
  val Rule22A3L2A: regulation.us.lcr.Rule.Rule.Rule22A3L2A.type  = regulation.us.lcr.Rule.Rule.Rule22A3L2A
  
  val Rule22A3L2B: regulation.us.lcr.Rule.Rule.Rule22A3L2B.type  = regulation.us.lcr.Rule.Rule.Rule22A3L2B
  
  val Rule22B3L1: regulation.us.lcr.Rule.Rule.Rule22B3L1.type  = regulation.us.lcr.Rule.Rule.Rule22B3L1
  
  val Rule22B3L2A: regulation.us.lcr.Rule.Rule.Rule22B3L2A.type  = regulation.us.lcr.Rule.Rule.Rule22B3L2A
  
  val Rule22B3L2B: regulation.us.lcr.Rule.Rule.Rule22B3L2B.type  = regulation.us.lcr.Rule.Rule.Rule22B3L2B
  
  val Rule22B5L1: regulation.us.lcr.Rule.Rule.Rule22B5L1.type  = regulation.us.lcr.Rule.Rule.Rule22B5L1
  
  val Rule22B5L2A: regulation.us.lcr.Rule.Rule.Rule22B5L2A.type  = regulation.us.lcr.Rule.Rule.Rule22B5L2A
  
  val Rule22B5L2B: regulation.us.lcr.Rule.Rule.Rule22B5L2B.type  = regulation.us.lcr.Rule.Rule.Rule22B5L2B
  
  def adjustedExcess: morphir.sdk.List.List[regulation.us.lcr.Rule.Rule] =
    morphir.sdk.List(
      (regulation.us.lcr.Rule.Rule21F : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule21G : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule21H : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule21I : regulation.us.lcr.Rule.Rule)
    )
  
  def applyRule(
    flag: morphir.sdk.Basics.Bool
  )(
    label: regulation.us.lcr.Rules.RuleName
  )(
    amount: regulation.us.lcr.Basics.Balance
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    if (flag) {
      morphir.sdk.List((regulation.us.lcr.Rules.RuleBalance(
        label,
        amount
      ) : regulation.us.lcr.Rules.RuleBalance))
    } else {
      morphir.sdk.List(
      
      )
    }
  
  def eligibleLevel1LiquidAssets: morphir.sdk.List.List[regulation.us.lcr.Rule.Rule] =
    morphir.sdk.List(
      (regulation.us.lcr.Rule.Rule20A1C : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule20A1 : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule22B3L1 : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule22A3L1 : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule22B5L1 : regulation.us.lcr.Rule.Rule)
    )
  
  def eligibleLevel2ALiquidAssets: morphir.sdk.List.List[regulation.us.lcr.Rule.Rule] =
    morphir.sdk.List(
      (regulation.us.lcr.Rule.Rule20B1 : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule22B3L2A : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule22A3L2A : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule22B5L2A : regulation.us.lcr.Rule.Rule)
    )
  
  def eligibleLevel2BLiquidAssets: morphir.sdk.List.List[regulation.us.lcr.Rule.Rule] =
    morphir.sdk.List(
      (regulation.us.lcr.Rule.Rule20C1 : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule22B3L2B : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule22A3L2B : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule22B5L2B : regulation.us.lcr.Rule.Rule)
    )
  
  def excessHQLAAdjustment: morphir.sdk.List.List[regulation.us.lcr.Rule.Rule] =
    morphir.sdk.List.concat(morphir.sdk.List(
      regulation.us.lcr.Rule.unadjustedExcess,
      regulation.us.lcr.Rule.adjustedExcess
    ))
  
  def rule: morphir.sdk.List.List[regulation.us.lcr.Rule.Rule] =
    morphir.sdk.List.concat(morphir.sdk.List(
      regulation.us.lcr.Rule.eligibleLevel1LiquidAssets,
      regulation.us.lcr.Rule.eligibleLevel2ALiquidAssets,
      regulation.us.lcr.Rule.eligibleLevel2BLiquidAssets,
      regulation.us.lcr.Rule.excessHQLAAdjustment
    ))
  
  def unadjustedExcess: morphir.sdk.List.List[regulation.us.lcr.Rule.Rule] =
    morphir.sdk.List(
      (regulation.us.lcr.Rule.Rule21C : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule21D : regulation.us.lcr.Rule.Rule),
      (regulation.us.lcr.Rule.Rule21E : regulation.us.lcr.Rule.Rule)
    )

}