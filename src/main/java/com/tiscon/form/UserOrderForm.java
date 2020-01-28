package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {
    @NotBlank(message = "お客様の名前を入力してください")
    private String customerName;

    @NotBlank(message = "電話番号を入力してください")
    @Numeric(message = "電話番号は半角数字で入力してください")
    private String tel;

    @Email
    @NotBlank(message = "メールを入力してください")
    private String email;

    @NotBlank(message = "転居元の都道府県を入力してください")
    private String oldPrefectureId;

    @NotBlank(message = "転居元の都道府県以降を入力してください")
    private String oldAddress;

    @NotBlank(message = "転居先の都道府県を入力してください")
    private String newPrefectureId;

    @NotBlank(message = "転居先の都道府県以降を入力してください")
    private String newAddress;

    @Numeric(message = "段ボールの個数は半角数字で入力してください")
    @NotBlank(message = "段ボールの個数を入力してください")
    private String box;

    @Numeric(message = "ベッドの個数は半角数字で入力してください")
    @NotBlank(message = "ベッドの個数を入力してください")
    private String bed;

    @Numeric(message = "自転車の個数は半角数字で入力してください")
    @NotBlank(message = "自転車の個数を入力してください")
    private String bicycle;

    @Numeric(message = "洗濯機の個数は半角数字で入力してください")
    @NotBlank(message = "洗濯機の個数を入力してください")
    private String washingMachine;

    @NotNull
    private Boolean hasWashingMachineSettingOption;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress(){
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public Boolean getHasWashingMachineSettingOption() {
        return hasWashingMachineSettingOption;
    }

    public void setHasWashingMachineSettingOption(Boolean hasWashingMachineSettingOption) {
        this.hasWashingMachineSettingOption = hasWashingMachineSettingOption;
    }
}
