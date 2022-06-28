package examples.navigation;

import examples.configuration.AppProperties;

public class ApplicationURLs {
    public static final String APPLICATION_URL = AppProperties.getAllUrl();
    public static final String LOGIN_URL = APPLICATION_URL + "actions/Account.action?signonForm=";
}