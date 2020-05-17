package medium;

public class ClonedTreeTargetReference {

	class TreeNode {
		int value;
		TreeNode right;
		TreeNode left;

		public TreeNode(int value) {
			this.value = value;
			this.left = this.right = null;
		}
	}

	public void demo() {

		TreeNode origin = new TreeNode(1);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);

		origin.right = four;
		origin.left = three;
		TreeNode six = new TreeNode(6);
		TreeNode nineteen = new TreeNode(19);

		three.left = six;
		three.right = nineteen;

		TreeNode cloned = new TreeNode(1);
		TreeNode threeCloned = new TreeNode(3);
		TreeNode fourCloned = new TreeNode(4);

		cloned.right = fourCloned;
		cloned.left = threeCloned;
		TreeNode sixCloned = new TreeNode(6);
		TreeNode nineteenCloned = new TreeNode(19);

		threeCloned.left = sixCloned;
		threeCloned.right = nineteenCloned;

		TreeNode target = getTargetCopy(origin, cloned, three);

		if (target != null) {
			System.out.println("Target found : " + target.value);
		}
	}

	private final TreeNode getTargetCopy(final TreeNode origin, final TreeNode cloned, final TreeNode target) {

		if (origin == null) {
			return null;
		}

		if (origin == target) {
			return cloned;
		}

		TreeNode left = getTargetCopy(origin.left, cloned.left, target);
		if (left != null) {
			return left;
		}

		TreeNode right = getTargetCopy(origin.right, cloned.right, target);

		if (right != null) {
			return right;
		}

		return null;
	}

}
