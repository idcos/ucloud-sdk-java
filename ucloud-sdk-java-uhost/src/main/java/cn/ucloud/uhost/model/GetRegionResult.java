package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取Region 结果类
 * @author: zhuww
 * @date: 2018-10-26 14:07
 **/

public class GetRegionResult extends BaseResponseResult {

    public static class UCloudRegion{
        /**
         * regionID
         */
        @SerializedName("RegionId")
        private String regionId;

        /**
         * regionName
         */
        @SerializedName("RegionName")
        private String regionName;

        /**
         * isDefault
         */
        @SerializedName("IsDefault")
        private Boolean isDefault;

        /**
         * region
         */
        @SerializedName("Region")
        private String region;

        /**
         * zone
         */
        @SerializedName("Zone")
        private String zone;


        public String getRegionId() {
            return regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getRegionName() {
            return regionName;
        }

        public void setRegionName(String regionName) {
            this.regionName = regionName;
        }

        public Boolean getDefault() {
            return isDefault;
        }

        public void setDefault(Boolean aDefault) {
            isDefault = aDefault;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        @Override
        public String toString() {
            return "UhostRegion{" +
                    "regionId='" + regionId + '\'' +
                    ", regionName='" + regionName + '\'' +
                    ", isDefault='" + isDefault + '\'' +
                    ", region='" + region + '\'' +
                    ", zone='" + zone + '\'' +
                    '}';
        }
    }



    /**
     * region列表
     */
    @SerializedName("Regions")
    private List<UCloudRegion> regions;


    public List<UCloudRegion> getRegions() {
        return regions;
    }

    public void setRegions(List<UCloudRegion> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "DescribeRegionResult{" +
                "regions=" + regions +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
