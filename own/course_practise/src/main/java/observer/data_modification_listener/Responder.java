package observer.data_modification_listener;

// Someone interested in "Hello" events

class Responder implements HelloListener {

    @Override
    public void someoneSaidHello() {
        System.out.println(this.getClass().getSimpleName() + "----> Hello there...: ");
    }
}