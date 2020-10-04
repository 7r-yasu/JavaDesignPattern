public abstract class Display {
	public abstract int getColumns();				//横の文字列を取得
	public abstract int getRows();					//縦の文字列を取得
	public abstract String getRowText(int row);	//row番号の文字列を取得
	public void show() {							//全部表示する
		for(int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
