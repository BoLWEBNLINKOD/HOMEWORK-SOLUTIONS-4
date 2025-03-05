public class Main {
    public static void main(String[] args) {
        // Singleton Demo
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));
        System.out.println("All Configurations:");
        configManager.printAllConfigs();

        // Adapter Demo
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);
        chatService.sendMessage("Hello world!");
    }
}
