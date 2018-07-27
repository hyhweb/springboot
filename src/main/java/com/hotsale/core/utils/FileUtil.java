/**
 * @author zexi.fu
 * 2017年2月23日
 */
package com.hotsale.core.utils;

import java.util.UUID;

/**
 * 文件工具
 *
 * @author zexi.fu
 * @date 2017年3月9日
 */
public class FileUtil {
//    public static final String APP_WIN_IMG_PATH = "E:\\ygb-work\\service\\upload";
//
//    public static final String APP_LINUX_IMG_PATH = "/nfs/appimg";

    /**
     * 获取存储到数据库中的路径（相对路径）(root:根路径;module:模块;ext:扩展名)
     */
    public static String getRelativePath(String root, String module, String ext) {

        return "/" + root + "/" + module + "/"
                + UUID.randomUUID().toString().replace("-", "")
                + System.currentTimeMillis() + "." + ext;

    }

//    /**
//     * 获取存储到硬盘中的路径
//     */
//    public static String getStorePath(String root, String module, String ext) {
//        return APP_LINUX_IMG_PATH + File.separator + root + File.separator + module
//                + File.separator
//                + UUID.randomUUID().toString().replace("-", "") + System.currentTimeMillis() + "." + ext;
//    }
//
//    /**
//     * 获取存储到硬盘中的路径
//     */
//    public static String getStorePath() {
//        return APP_LINUX_IMG_PATH;
//    }


}
