Step 6: Test the Vulnerabilities
Now that your app is set up, you can test the vulnerabilities.

1. Launch the Exported Activity

Use ADB or another app to launch the exported activity:
adb shell am start -n com.security.exportedcomponentapp/.ExportedActivity
This will launch the exported activity from outside the app, even though it should not be accessible.

2. Start the Exported Service

Start the insecure exported service via ADB:
adb shell am startservice -n com.security.exportedcomponentapp/.ExportedService
The service will run and show a toast, indicating that it started.

3. Query the Exported Content Provider

Attempt to query the content provider for sensitive data:
adb shell content query --uri content://com.security.exportedcomponentapp.provider
Since the content provider has no permission checks, any app can query it.

