module fiit.vava.client {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires io.grpc;

    requires server;
    requires annotations.api;
    requires jjwt;
    requires io.grpc.stub;
    requires org.slf4j;
    requires MaterialFX;
    requires org.apache.pdfbox;
    requires protobuf.java;
    requires java.dotenv;

    opens fiit.vava.client to javafx.fxml;
    exports fiit.vava.client;

    opens fiit.vava.client.controllers to javafx.fxml;

    exports fiit.vava.client.controllers.admin;
    opens fiit.vava.client.controllers.admin to javafx.fxml;

    exports fiit.vava.client.controllers.client;
    opens fiit.vava.client.controllers.client to javafx.fxml;

    exports fiit.vava.client.controllers.coworker;
    opens fiit.vava.client.controllers.coworker to javafx.fxml;

    exports fiit.vava.client.controllers.coworker.profile;
    opens fiit.vava.client.controllers.coworker.profile to javafx.fxml;

    exports fiit.vava.client.controllers.admin.profile;
    opens fiit.vava.client.controllers.admin.profile to javafx.fxml;

    exports fiit.vava.client.controllers.coworker.clients.approve;
    opens fiit.vava.client.controllers.coworker.clients.approve to javafx.fxml;

    exports fiit.vava.client.controllers._components.routing;
    opens fiit.vava.client.controllers._components.routing to javafx.fxml;

    exports fiit.vava.client.controllers.auth.login;
    opens fiit.vava.client.controllers.auth.login to javafx.fxml;

    exports fiit.vava.client.controllers.auth.registration;
    opens fiit.vava.client.controllers.auth.registration to javafx.fxml;

    exports fiit.vava.client.controllers.client.documents;
    opens fiit.vava.client.controllers.client.documents to javafx.fxml;

    exports fiit.vava.client.controllers.client.profile;
    opens fiit.vava.client.controllers.client.profile to javafx.fxml;

    exports fiit.vava.client.controllers.admin.templates;
    opens fiit.vava.client.controllers.admin.templates to javafx.fxml;

    exports fiit.vava.client.controllers.admin.templates.create;
    opens fiit.vava.client.controllers.admin.templates.create to javafx.fxml;

    exports fiit.vava.client.controllers.client.documents.createByTemplate;
    opens fiit.vava.client.controllers.client.documents.createByTemplate to javafx.fxml;
}
