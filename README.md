# kingether-library

<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
   <servers>
     <server>
       <id>ossrh</id>
       <username>MY_SONATYPE_DOT_COM_USERNAME</username>
       <password>MY_SONATYPE_DOT_COM_PASSWORD</password>
     </server>
   </servers>

   <pluginGroups></pluginGroups>
   <proxies></proxies>
   <mirrors></mirrors>
   <profiles></profiles>
</settings>
commands after added to the project: 
1. mvn verify
2. mvn clean deploy -P release
3.  At this point, the artifacts are stored in a private repository, so you can verify them before releasing them. So log in to https://s01.oss.sonatype.org/ using your JIRA credentials.

On the left menu, click on 'Staging Repositories' and you’ll see your library.

If everything is OK with your library, you can close it, otherwise, you can drop it.

When you close it, on the low section, you can check if it was closed successfully by clicking on the 'Activity' tab. You should see something similar to this:

4. Run the following command using your Repository ID. On the image above, it’s kingetherlibrary-1005. Don’t forget to replace it with your own ID.

mvn nexus-staging:release -DstagingRepositoryId=kingetherlibrary-1005

Note
Use your own group ID. If you use com.kingether.api.library you won’t be able to publish to Maven Central.

ERROR THAT MIGHT OCCUR WHILE PUSHING TO NEXUS SERVER. check of you have maven settings.xml in the user/home/.m2.
make use the version isnt the same as the previous upload. 

Make sure you have generated a gpg key and publish it. if not, following the commands below:

1. gpg --generate-key -- is use to generate gpg key
2.gpg --list-secret-keys  - is use to list all the keys on your system.
2.  gpg --keyserver keyserver.ubuntu.com --send-keys yourkeyID -- use to publish your key to keyserver.ubuntu.com
NOTE: you can use any server but i prefer ubuntu server cos of my os.
