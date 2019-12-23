package de.blinkt.openvpn.core;

import android.content.Context;

/**
 * Created by arne on 06.10.17.
 */

public interface VPNNotifications {

    void addPiaNotificationExtra(android.support.v4.app.NotificationCompat.Builder nbuilder, Context context, DeviceStateReceiver receiver);

    void showKillSwitchNotification(Context context);

    void stopKillSwitchNotification(Context context);

    void showRevokeNotification(Context context);

    int getIconByConnectionStatus(ConnectionStatus level);

    int getColorByConnectionStatus(Context context, ConnectionStatus level);
}
