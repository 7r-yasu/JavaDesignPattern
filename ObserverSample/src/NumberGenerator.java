import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
	private ArrayList<Observer> observers = new ArrayList<Observer>(); //Observerたちを保持

	//Observerを追加
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	//Observerを削除
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	//Observerへ通知
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()) {
			Observer o = it.next();
			o.update(this);
		}
	}
	public abstract int getNumber(); //数を取得する
	public abstract void execute(); //数を生成する
}
