
package gov.anzong.meizi;

import sp.phone.utils.PhoneConfiguration;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class MeiziNavigationUtil {

    public static void startBrowser(Context context, String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        context.startActivity(intent);
    }

    public static void startTopicActivity(Activity activity, String topicUrl) {
        Intent intent = new Intent(activity, PhoneConfiguration.getInstance().MeiziTopicActivityClass);
        intent.putExtra(MeiziTopicActivity.ARG_KEY_URL, topicUrl);
        activity.startActivity(intent);
    }
}
