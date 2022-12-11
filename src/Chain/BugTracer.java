package Chain;

public class BugTracer {
    public static void main(String[] args) {

        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smstNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smstNotifier);

        reportNotifier.notifyManager("Everything is OK", Priority.ROUTINE);
        System.out.println();
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        System.out.println();
        reportNotifier.notifyManager("Houston, we've had a problem here!!!", Priority.ASAP);
    }
}
