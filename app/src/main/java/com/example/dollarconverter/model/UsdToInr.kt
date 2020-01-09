package com.example.dollarconverter.model
import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class UsdToInr(
    @SerializedName("privacy")
    var privacy: String?,
    @SerializedName("quotes")
    var quotes: Quotes?,
    @SerializedName("source")
    var source: String?,
    @SerializedName("success")
    var success: Boolean?,
    @SerializedName("terms")
    var terms: String?,
    @SerializedName("timestamp")
    var timestamp: Int?
) : Parcelable {
    @SuppressLint("ParcelCreator")
    @Parcelize
    data class Quotes(
        @SerializedName("USDAED")
        var uSDAED: Double?,
        @SerializedName("USDAFN")
        var uSDAFN: Double?,
        @SerializedName("USDALL")
        var uSDALL: Double?,
        @SerializedName("USDAMD")
        var uSDAMD: Double?,
        @SerializedName("USDANG")
        var uSDANG: Double?,
        @SerializedName("USDAOA")
        var uSDAOA: Double?,
        @SerializedName("USDARS")
        var uSDARS: Double?,
        @SerializedName("USDAUD")
        var uSDAUD: Double?,
        @SerializedName("USDAWG")
        var uSDAWG: Double?,
        @SerializedName("USDAZN")
        var uSDAZN: Double?,
        @SerializedName("USDBAM")
        var uSDBAM: Double?,
        @SerializedName("USDBBD")
        var uSDBBD: Double?,
        @SerializedName("USDBDT")
        var uSDBDT: Double?,
        @SerializedName("USDBGN")
        var uSDBGN: Double?,
        @SerializedName("USDBHD")
        var uSDBHD: Double?,
        @SerializedName("USDBIF")
        var uSDBIF: Int?,
        @SerializedName("USDBMD")
        var uSDBMD: Int?,
        @SerializedName("USDBND")
        var uSDBND: Double?,
        @SerializedName("USDBOB")
        var uSDBOB: Double?,
        @SerializedName("USDBRL")
        var uSDBRL: Double?,
        @SerializedName("USDBSD")
        var uSDBSD: Double?,
        @SerializedName("USDBTC")
        var uSDBTC: Double?,
        @SerializedName("USDBTN")
        var uSDBTN: Double?,
        @SerializedName("USDBWP")
        var uSDBWP: Double?,
        @SerializedName("USDBYN")
        var uSDBYN: Double?,
        @SerializedName("USDBYR")
        var uSDBYR: Int?,
        @SerializedName("USDBZD")
        var uSDBZD: Double?,
        @SerializedName("USDCAD")
        var uSDCAD: Double?,
        @SerializedName("USDCDF")
        var uSDCDF: Double?,
        @SerializedName("USDCHF")
        var uSDCHF: Double?,
        @SerializedName("USDCLF")
        var uSDCLF: Double?,
        @SerializedName("USDCLP")
        var uSDCLP: Double?,
        @SerializedName("USDCNY")
        var uSDCNY: Double?,
        @SerializedName("USDCOP")
        var uSDCOP: Double?,
        @SerializedName("USDCRC")
        var uSDCRC: Double?,
        @SerializedName("USDCUC")
        var uSDCUC: Int?,
        @SerializedName("USDCUP")
        var uSDCUP: Double?,
        @SerializedName("USDCVE")
        var uSDCVE: Double?,
        @SerializedName("USDCZK")
        var uSDCZK: Double?,
        @SerializedName("USDDJF")
        var uSDDJF: Double?,
        @SerializedName("USDDKK")
        var uSDDKK: Double?,
        @SerializedName("USDDOP")
        var uSDDOP: Double?,
        @SerializedName("USDDZD")
        var uSDDZD: Double?,
        @SerializedName("USDEGP")
        var uSDEGP: Double?,
        @SerializedName("USDERN")
        var uSDERN: Double?,
        @SerializedName("USDETB")
        var uSDETB: Double?,
        @SerializedName("USDEUR")
        var uSDEUR: Double?,
        @SerializedName("USDFJD")
        var uSDFJD: Double?,
        @SerializedName("USDFKP")
        var uSDFKP: Double?,
        @SerializedName("USDGBP")
        var uSDGBP: Double?,
        @SerializedName("USDGEL")
        var uSDGEL: Double?,
        @SerializedName("USDGGP")
        var uSDGGP: Double?,
        @SerializedName("USDGHS")
        var uSDGHS: Double?,
        @SerializedName("USDGIP")
        var uSDGIP: Double?,
        @SerializedName("USDGMD")
        var uSDGMD: Double?,
        @SerializedName("USDGNF")
        var uSDGNF: Double?,
        @SerializedName("USDGTQ")
        var uSDGTQ: Double?,
        @SerializedName("USDGYD")
        var uSDGYD: Double?,
        @SerializedName("USDHKD")
        var uSDHKD: Double?,
        @SerializedName("USDHNL")
        var uSDHNL: Double?,
        @SerializedName("USDHRK")
        var uSDHRK: Double?,
        @SerializedName("USDHTG")
        var uSDHTG: Double?,
        @SerializedName("USDHUF")
        var uSDHUF: Double?,
        @SerializedName("USDIDR")
        var uSDIDR: Double?,
        @SerializedName("USDILS")
        var uSDILS: Double?,
        @SerializedName("USDIMP")
        var uSDIMP: Double?,
        @SerializedName("USDINR")
        var uSDINR: Double?,
        @SerializedName("USDIQD")
        var uSDIQD: Double?,
        @SerializedName("USDIRR")
        var uSDIRR: Double?,
        @SerializedName("USDISK")
        var uSDISK: Double?,
        @SerializedName("USDJEP")
        var uSDJEP: Double?,
        @SerializedName("USDJMD")
        var uSDJMD: Double?,
        @SerializedName("USDJOD")
        var uSDJOD: Double?,
        @SerializedName("USDJPY")
        var uSDJPY: Double?,
        @SerializedName("USDKES")
        var uSDKES: Double?,
        @SerializedName("USDKGS")
        var uSDKGS: Double?,
        @SerializedName("USDKHR")
        var uSDKHR: Double?,
        @SerializedName("USDKMF")
        var uSDKMF: Double?,
        @SerializedName("USDKPW")
        var uSDKPW: Double?,
        @SerializedName("USDKRW")
        var uSDKRW: Double?,
        @SerializedName("USDKWD")
        var uSDKWD: Double?,
        @SerializedName("USDKYD")
        var uSDKYD: Double?,
        @SerializedName("USDKZT")
        var uSDKZT: Double?,
        @SerializedName("USDLAK")
        var uSDLAK: Double?,
        @SerializedName("USDLBP")
        var uSDLBP: Double?,
        @SerializedName("USDLKR")
        var uSDLKR: Double?,
        @SerializedName("USDLRD")
        var uSDLRD: Double?,
        @SerializedName("USDLSL")
        var uSDLSL: Double?,
        @SerializedName("USDLTL")
        var uSDLTL: Double?,
        @SerializedName("USDLVL")
        var uSDLVL: Double?,
        @SerializedName("USDLYD")
        var uSDLYD: Double?,
        @SerializedName("USDMAD")
        var uSDMAD: Double?,
        @SerializedName("USDMDL")
        var uSDMDL: Double?,
        @SerializedName("USDMGA")
        var uSDMGA: Double?,
        @SerializedName("USDMKD")
        var uSDMKD: Double?,
        @SerializedName("USDMMK")
        var uSDMMK: Double?,
        @SerializedName("USDMNT")
        var uSDMNT: Double?,
        @SerializedName("USDMOP")
        var uSDMOP: Double?,
        @SerializedName("USDMRO")
        var uSDMRO: Double?,
        @SerializedName("USDMUR")
        var uSDMUR: Double?,
        @SerializedName("USDMVR")
        var uSDMVR: Double?,
        @SerializedName("USDMWK")
        var uSDMWK: Double?,
        @SerializedName("USDMXN")
        var uSDMXN: Double?,
        @SerializedName("USDMYR")
        var uSDMYR: Double?,
        @SerializedName("USDMZN")
        var uSDMZN: Double?,
        @SerializedName("USDNAD")
        var uSDNAD: Double?,
        @SerializedName("USDNGN")
        var uSDNGN: Double?,
        @SerializedName("USDNIO")
        var uSDNIO: Double?,
        @SerializedName("USDNOK")
        var uSDNOK: Double?,
        @SerializedName("USDNPR")
        var uSDNPR: Double?,
        @SerializedName("USDNZD")
        var uSDNZD: Double?,
        @SerializedName("USDOMR")
        var uSDOMR: Double?,
        @SerializedName("USDPAB")
        var uSDPAB: Double?,
        @SerializedName("USDPEN")
        var uSDPEN: Double?,
        @SerializedName("USDPGK")
        var uSDPGK: Double?,
        @SerializedName("USDPHP")
        var uSDPHP: Double?,
        @SerializedName("USDPKR")
        var uSDPKR: Double?,
        @SerializedName("USDPLN")
        var uSDPLN: Double?,
        @SerializedName("USDPYG")
        var uSDPYG: Double?,
        @SerializedName("USDQAR")
        var uSDQAR: Double?,
        @SerializedName("USDRON")
        var uSDRON: Double?,
        @SerializedName("USDRSD")
        var uSDRSD: Double?,
        @SerializedName("USDRUB")
        var uSDRUB: Double?,
        @SerializedName("USDRWF")
        var uSDRWF: Int?,
        @SerializedName("USDSAR")
        var uSDSAR: Double?,
        @SerializedName("USDSBD")
        var uSDSBD: Double?,
        @SerializedName("USDSCR")
        var uSDSCR: Double?,
        @SerializedName("USDSDG")
        var uSDSDG: Double?,
        @SerializedName("USDSEK")
        var uSDSEK: Double?,
        @SerializedName("USDSGD")
        var uSDSGD: Double?,
        @SerializedName("USDSHP")
        var uSDSHP: Double?,
        @SerializedName("USDSLL")
        var uSDSLL: Double?,
        @SerializedName("USDSOS")
        var uSDSOS: Double?,
        @SerializedName("USDSRD")
        var uSDSRD: Double?,
        @SerializedName("USDSTD")
        var uSDSTD: Double?,
        @SerializedName("USDSVC")
        var uSDSVC: Double?,
        @SerializedName("USDSYP")
        var uSDSYP: Double?,
        @SerializedName("USDSZL")
        var uSDSZL: Double?,
        @SerializedName("USDTHB")
        var uSDTHB: Double?,
        @SerializedName("USDTJS")
        var uSDTJS: Double?,
        @SerializedName("USDTMT")
        var uSDTMT: Double?,
        @SerializedName("USDTND")
        var uSDTND: Double?,
        @SerializedName("USDTOP")
        var uSDTOP: Double?,
        @SerializedName("USDTRY")
        var uSDTRY: Double?,
        @SerializedName("USDTTD")
        var uSDTTD: Double?,
        @SerializedName("USDTWD")
        var uSDTWD: Double?,
        @SerializedName("USDTZS")
        var uSDTZS: Double?,
        @SerializedName("USDUAH")
        var uSDUAH: Double?,
        @SerializedName("USDUGX")
        var uSDUGX: Double?,
        @SerializedName("USDUSD")
        var uSDUSD: Int?,
        @SerializedName("USDUYU")
        var uSDUYU: Double?,
        @SerializedName("USDUZS")
        var uSDUZS: Double?,
        @SerializedName("USDVEF")
        var uSDVEF: Double?,
        @SerializedName("USDVND")
        var uSDVND: Double?,
        @SerializedName("USDVUV")
        var uSDVUV: Double?,
        @SerializedName("USDWST")
        var uSDWST: Double?,
        @SerializedName("USDXAF")
        var uSDXAF: Double?,
        @SerializedName("USDXAG")
        var uSDXAG: Double?,
        @SerializedName("USDXAU")
        var uSDXAU: Double?,
        @SerializedName("USDXCD")
        var uSDXCD: Double?,
        @SerializedName("USDXDR")
        var uSDXDR: Double?,
        @SerializedName("USDXOF")
        var uSDXOF: Double?,
        @SerializedName("USDXPF")
        var uSDXPF: Double?,
        @SerializedName("USDYER")
        var uSDYER: Double?,
        @SerializedName("USDZAR")
        var uSDZAR: Double?,
        @SerializedName("USDZMK")
        var uSDZMK: Double?,
        @SerializedName("USDZMW")
        var uSDZMW: Double?,
        @SerializedName("USDZWL")
        var uSDZWL: Double?
    ) : Parcelable
}