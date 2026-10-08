/**
 * Task 4: Documentation Notes - Polymorphism
 *
 * NOTE: Polymorphism means "many forms" - the same method call behaves differently
 * depending on the object.
 *  - Compile-time (overloading): same method name, different parameters.
 *  - Runtime (overriding): a child class replaces a parent method, and Java picks
 *    the version based on the actual object at runtime.
 */
class Notifier {
    void send(String message) {
        System.out.println("Generic notification: " + message);
    }

    // NOTE: overloading - same name, extra parameter
    void send(String message, int times) {
        for (int i = 0; i < times; i++) {
            send(message);
        }
    }
}

class EmailNotifier extends Notifier {
    // NOTE: overriding - same signature as the parent, different behavior
    @Override
    void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SmsNotifier extends Notifier {
    @Override
    void send(String message) {
        System.out.println("SMS: " + message);
    }
}

public class PolymorphismNotes {
    public static void main(String[] args) {
        // NOTE: the reference type is Notifier, but each object runs its own send()
        Notifier[] notifiers = { new Notifier(), new EmailNotifier(), new SmsNotifier() };
        for (Notifier notifier : notifiers) {
            notifier.send("Your order has shipped");
        }

        new SmsNotifier().send("Reminder", 2); // NOTE: overloaded method calling the overridden one
    }
}
