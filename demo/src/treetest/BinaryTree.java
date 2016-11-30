package treetest;

public class BinaryTree {
	int data;//根节点数据
	BinaryTree left;//左子树
	BinaryTree right;//右子树
	
	public BinaryTree(int data){//实例化
		this.data=data;
		left=null;
		right=null;
	}
	
	public void insert(BinaryTree root,int data){//向二叉树中插入子节点
		if(data>root.data){
			if(root.right==null){
				root.right=new BinaryTree(data);
			}else{
				this.insert(root.right, data);
			}
		}else{
		    if(root.left==null){
		    	root.left = new BinaryTree(data);
		    }else{
		    	this.insert(root.left, data);
		    }
		}
	}
}
