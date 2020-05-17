package com.aki;

import easy.BalancedBraces;
import easy.NonDecreasingArray;
import easy.PrintDiamond;
import easy.ReverseNumber;
import easy.TwoSum;
import hard.LargestIsland;
import hard.MakeLargestIsland;
import hard.NumberOfIslands;
import medium.AtoI;
import medium.BrokenCalculator;
import medium.ClonedTreeTargetReference;
import medium.DivideTwoInts;
import medium.EliminateUniqueDigits;
import medium.FractionToString;
import medium.IsPalindrome;
import medium.MatrixRowColZero;
import medium.MinimumSwapsBG;
import medium.MyLinkedList;
import medium.ReOrderWords;
import medium.ReverseLinkedList;
import medium.ReverseWordsInSentence;
import medium.TeamsCount;
import medium.ValidateIpAddress;

public class Begin {

	private static TwoSum twoSum;
	private static AtoI atoi;
	private static ReverseNumber reverseNumber;
	private static DivideTwoInts divideTwoInts;
	private static EliminateUniqueDigits uniqueDigits;
	private static BrokenCalculator brokenCalc;
	private static IsPalindrome palindrome;
	private static ReverseWordsInSentence reverseWords;
	private static ReOrderWords reorderWords;
	private static FractionToString fractionToString;
	private static NonDecreasingArray nonDecreasingArray;
	private static NumberOfIslands numberOfIslands;
	private static LargestIsland largestIsland;
	private static MakeLargestIsland makeLargestIsland;
	private static ValidateIpAddress validateIp;
	private static MyLinkedList myLinkedList;
	private static MatrixRowColZero matrixZero;
	private static MinimumSwapsBG minimumSwap;
	private static BalancedBraces balancedBraces;
	private static PrintDiamond printDiamond;
	private static ClonedTreeTargetReference clonedTreeRef;
	private static TeamsCount teamsCount;
	private static ReverseLinkedList reverseLL;

	private static void initialize() {
		twoSum = new TwoSum();
		atoi = new AtoI();
		reverseNumber = new ReverseNumber();
		divideTwoInts = new DivideTwoInts();
		uniqueDigits = new EliminateUniqueDigits();
		brokenCalc = new BrokenCalculator();
		palindrome = new IsPalindrome();
		reverseWords = new ReverseWordsInSentence();
		reorderWords = new ReOrderWords();
		fractionToString = new FractionToString();
		nonDecreasingArray = new NonDecreasingArray();
		numberOfIslands = new NumberOfIslands();
		largestIsland = new LargestIsland();
		makeLargestIsland = new MakeLargestIsland();
		validateIp = new ValidateIpAddress();
		myLinkedList = new MyLinkedList();
		matrixZero = new MatrixRowColZero();
		minimumSwap = new MinimumSwapsBG();
		balancedBraces = new BalancedBraces();
		printDiamond = new PrintDiamond();
		clonedTreeRef = new ClonedTreeTargetReference();
		teamsCount = new TeamsCount();
		reverseLL = new ReverseLinkedList();
	}

	public static void main(String[] args) {
		initialize();
		twoSum.demo();
		atoi.demo();
		reverseNumber.demo();
		divideTwoInts.demo();
		uniqueDigits.demo();
		brokenCalc.demo();
		palindrome.demo();
		reverseWords.demo();
		reorderWords.demo();
		fractionToString.demo();
		nonDecreasingArray.demo();
		numberOfIslands.demo();
		largestIsland.demo();
		makeLargestIsland.demo();
		validateIp.demo();
		myLinkedList.demo();
		matrixZero.demo();
		minimumSwap.demo();
		balancedBraces.demo();
		printDiamond.demo();
		clonedTreeRef.demo();
		teamsCount.demo();
		reverseLL.demo();
	}

}
