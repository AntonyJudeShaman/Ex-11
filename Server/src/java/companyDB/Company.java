
package companyDB;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.*;
import javax.jws.WebParam;

/**
 *
 * @author Antony Jude
 */
@WebService(serviceName = "Company")
public class Company {

    
    @WebMethod(operationName = "compsear")
    public String[] compsear(@WebParam(name = "companyName") String companyName) {
        //TODO write your implementation code here:
        HashMap<String,String[]> map=new HashMap<String,String[]>();
        String[] strarr;
        String description,img;
        img="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAHcAAAB3CAMAAAAO5y+4AAAAk1BMVEX////lGDfiAAD63N3rb3vkACPkACXlFDXrbXnkACr2wsb52dr2xcnjABvlDTLjABj74+X++PnjABH98fLugoz40tXzsLbyoqjnOU7tfIX86uvxnaTsdH/sfID0tbrrYG7uio/pUWLoSFfqaXHpW2PmK0PpWGjmJj3wkJj0u73nQU7lMj/wlp3oUFvyqa3pZGfkIzDus2eQAAAEsElEQVRoge2a23aqOhRAI5qEgAl3RLEoUrTuWuv/f92BJNys7a6ocexxmE8CMZPAYuUCAAwMDPyv8OxgaiRhGCb7aWB7D/fZxnG9yl1Ncy1KIYdaxaaWr/yjYT9CaSbrqFAhwvDoK5gRVJxD5CfBHZ3BcXsikLDaglkbXJ8JK0qd0mPg3O5cGMucQNnIslnUhaNok75mgtfXTbSDLi1OS/gxg+Rd3y9ukiarHSWyOmSR6HUZG6a98JxWixxvYZvGbPkaMQuJE8SE7rZhT7UTZCPK6ymagPKPt+n458j17OkhzRGU/6Esm/YI9cXOraRsEweiBscz97H/EnZK7pd+nASeuAReMPvAldpl4+vFaRlHDKFVIi6YefTTkebSIqStaatcQEl51zWczmcmly/2GUHlv3HeI8IMFxMtTXhDg8PWcmH9DGHa3DsPVTsZQ66bHvg5OclWI5iG39T9I3/gweNVTDSreYjEA3OqS72fHSGWloVlM72YnL6t+yd4m4zMgt2aRfUfstCKXDiIrNW+rqEH9mGHLkhLoM9LHOjlwwzht95500PwS1LEVXbi986gZ3tbBZHVO3cYLW+ROKjFQ0vmLhiAMZG/y0wGLYpayRvTpK8WgLAOVvi+io3AHNu2Ie8oy4NI3gRi2PbYDIw4i2D9h1l/bZETGK+asbBOPYtcVs2Y1OK8vqLOfiT+QG5obYm9KVsA2zHycR5qdXDz0yqvNYzM27QFM4uQQ3tH9sWbtQ8fEXEP4A44a63zSMTozIvi9mFP8+818ulm2cA683bSdSG+k/UcG5554UNGVl/wom6SwNHjR5Scz7Ou4FONFvjdvoDMFXnD7g2GR0XesdvxurfniN/hdR9gqCisgLNpBxbb3GGY/jteOt6JKi04tAOavCnzGu3RDd0r8y60lle7aSp0FU57PIOUhRUA2yawWKpOC9ZNYDFVWbJk1mSObqf/YIImU551+o/FaQJaUxhWAIyqgMZEpbYZU7KtUm+dKclaqTepun7Ya2rdG7sKaEtVpy+pAlpTqwVycqY4nAGYi8BiK8Xeo8iU5KZZbg+mwovUdfqChXiQFE2NWvAVCAxVa+UyYqTcy7t+ZVOjBp4plU2NGoKyvUhlpy/w+GqZujFszXvh3anXAp2pHcNWFGNKhVOjhilVOTVqGDNM7vl27Lc4Ods9IZwB2LA/z9CCOcz+XugBhJrKqVFDoKnPkiU27vEW7g44n6oWrs5YP0cLnpE1BgYGBgYGBgb+RRxzXCO+5DIbxJSoVYBve2ZnbNk6fMWY0zlpBW75QaZ24v/ztRoxZh7V22JFJ9Y6KyxZffiqj4O8ta7rIzbR9epTjJkuWMrl5ogsORO57D1zu+vfcSbKz69fz4t+WlqO3O72ubc/TttrNIjrHNFpxSVvUB+dXvuap+M9aJbAlW8/cyJ3QHTJu6USSK+90B0vSOYSWc2bL8H4kndFshdOTm7zfkvt7XxvtarWh7e3eb88v2BhBgWmWXtjWzAWXjlFTa/35i3vunl+RT1HKjeJeLERW5bcseHNdCvv9fd33V69CPUJZynqs9NJDd+xz8SG7vP4fcukbq0/ZclnYGBg4N/nP9n3TIvOdCz2AAAAAElFTkSuQmCC";
        description="Tesla, Inc. is an American multinational automotive and clean energy company headquartered in Austin, Texas. Tesla designs and manufactures electric vehicles, battery energy storage from home to grid-scale, solar panels and solar roof tiles, and related products and services";
        strarr=new String[]{description,img};
        map.put("Tesla",strarr);
        img="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAeFBMVEUAAAD////y8vIYGBgzMzMjIyMGBgb7+/sTExPo6OjX19dra2uNjY21tbW8vLwcHByBgYFQUFB0dHRmZmaqqqouLi7IyMjV1dXi4uI6OjqkpKTu7u56enonJyecnJzOzs5AQECHh4eRkZFJSUlUVFQ+Pj5eXl5wcHCyU2VbAAACyElEQVR4nO3Xa3OiMBSAYcNdW0TBW4uXit36///hchIuAa07nRWd6bzPl5JDDuQYEuhoBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANzmJm7w7DEMxJ2n2ct27u2SX1hhlC6m8T47LZ89kEF4rysnj7NnD2Mgy3QVqslx9+xxDMQrJkpNZt6zxzGU7VqpcDFweW6rDkWJeyVqzHvpVteoCgWddNdNdHSZWF20U6yU2mzvXlGHvxo7rc27icaObXz4bBNe1clKj2I7PZ+Y0W7DTr4T6hV2zuV43+Sey+lTh8H3lnINdEx1dNqLqqbEL6XGVvpFx7NEj/2o2f4/NnJ88HVjK43J8HtnECqVjoJW0gw8qsKjpPyt4zohbn4FzSlHaacH5im03tXmGpWFrrec6Gxc/nUe8W4IyiG+XIalwrZVKLVqGjK0WdPSFf5AJgnzkzw54f7f3e9A5nCfvdS+qnC3woVd4Ulm4U/dul5hmo8r+bR3yl8XgZ7Jw9sdy7hl010wYaqjUuGkJl3e24xC9r+6cb3CWXvBy7MyjUod71/KN5J1aClvrbe9/gaytjd5OVmvy+8rTINEuP1z+tIb9/x+mTaYqBYsywF/1cN4rRVH8/Au44qM0cz1jQrPV+/1Kcu4/H3Kaxye8X2d2BX2T/p553E2H5E/rNC8Rgr9pKvwIZ/Z7s5vJW+3KkyLelKPcbMUHTmwLrHTLzupcOta4eoS5mUhd8hkQajFAyqc99/Nof9dhbZ1PbxVP18/vbN+1Cxj3Tk0e2iw1vvQAzbU8zi068vNZ5dUeOs/bF/2Q3mP+ivHrsQx+0e/QkcqjA5ymDc17eXG4cAfpdrSs1Sxnefd/nX9su+y7tqqds7E65Fg9CFHSffGbx/3LgcAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/4y+TVh5HJUyKZAAAAABJRU5ErkJggg==";
        description="The Space Exploration Technologies Corporation, commonly referred to as SpaceX is an American spacecraft manufacturer, launcher, and satellite communications company headquartered in Hawthorne, California. It was founded in 2002 by Elon Musk with the goal of reducing space transportation costs to colonization of Mars.";
        strarr=new String[]{description,img};
        map.put("SpaceX",strarr);
        img="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAARsAAACyCAMAAABFl5uBAAAAtFBMVEX///+/oWEAAAAfGRe7uroaExELAADOzc0bFRKbmZgtKCc7NjUIAAC+n137+/u7m1WioaGwr68iHBqPjY1wbm0SCATW1dXw8PDQz8+6mlF3dXTj4uLd3NyHhYRmZGPr6upeW1pIRUR/fXxTUE9BPTzEw8LDp2yUkpI3MzHu59nh1LvSvpb08Oeqqai3trVPTEvNtojn3crczrHe0LTKsoDYxqPGq3T59u/r4tG2kkDUwZwpIyH8R7KEAAAR9ElEQVR4nO1ca2OivBK2URCsolYDtqh4rbZbtd1tt+/Z/v//dZJMAglEELV1l/J82S2XMHmYzC2DlUqJEiVKlPjmeH8geHq/tBh/GZ4e357v2wL3z2+PT5cW6a/A++Mz4aPVuorQapEjr7++Oz8vr7dtmRaJoPbt/dv3pefpzz5iBD+3rw+XFvIieHq+TSWGa8/v/y4t6Jfj/ccBzHB2vpnuPKYvptjK+nFpcb8Qzmv7YGYYO1ffRnUeWocrjVCdn5cW+mvweJuTGYr286XF/gq8HUMNUZ3flxb88/Ejn6n5TuQcTU3xyXk7nhpCzuulxf9MHGWGI7T/XHoCn4eH06i5urp9ufQUPgtO3rBGQ05RM/PX07lp3V96Ep+Dx1PssEC7kAHy+zmoIauqiAXlH6evKIpWAZOHp1N9lMBt8XLy5/OoTRHD47OpTQEV50zWhqJoFsc5j5MCFMxVvZyTm4LFOIeExK3WobXSQgXHTpYlbrXbV6/Pz7+v2odsQBQqq/ovdUm12ldvDw5c6Ty8XWWuv9avy07nrHhLU4bE1uXLfQY7hfJUKeam1dLUZLLq7a2vn8KnYT817WdHd8NLOjnt4njx970zbb/tuSW9oNEuTgPBw76JpkQqqV6//fiF0n8u9kV+e7WG4ClNcVrFif72LJB0d/M7RXFaxdlw+LVHB1Jv+pmiOK3idJ381KpARq0hLV4sOjdZAVyawSkSN7ppZiVFabX3AtkbnS3OjPtT9SbFwf1j0PnwdlZlc29QRG8uTrKpm6Zcg9FmAI8pPrxdnH1xzfJQVoU2yk0LjDOV7h9CMp+SZ/euMz2pGxMFyjUrvxOzu5XS7xddySF9P+vLJP98/ElMVDY3PzQbB6nF90LVthIzVWbXTrqd1EyzSGm4poAjm2KSHMQ3DtL891XBaumV+zg30pv/0Yr7nV9Z2xJfLP3nIp41SAEK3fJU8qPsUnpxomKKuEeWuGEJBbXGztP7+9PLn1bmFkyxllQikpMKvvehKvz83+0hW3eFazKJeapIb3iZpk3jnbRyllbnCoJ98+OlT3Djh7WtX24SnwS1ThFGKFE7NvvzgM8dChXccKgTFNFeaIe4JmW3vhWqiYJDsTjCDUdqIz7kyOpGuS3Otp0EedYiZ5Ba3URSdZ/+yXgxv4VREge+MiQeQvOcSk6RqhMyZHPMfLZCV7hX+Z7CTXE/hJEMLWRQck4Z5Q37dxgKtPeSQLRcwFEp3ERli30VisJFxDKi5QI29UmrN/s+QmtdaXt1ioKnMF9q0z/ltmMlu/5PR06roHZYINQUyDYlv66mScnGrVa7YOl3EkJzYNtWcl1tdcHE61utq4JrDcX7FSeH/hEtqkR9XM07W/eFtjUh4FdMYFGFZYlkx8kfORwq0s5CKn7eRorS2qM2BM+CnNZtAXPvfXig6woSKO6RtN+2/Lq6Zb9q9+cbmBoJb7ctHtCwks2+oszTy+NLgfa+D8TT6y2vif9uFWuj8hx4+A3JuFPYL+JPwQPUqd6/iX8uUaJEiRIlSnwXeH2Exv6lpfgr4WGzWsXoXyTH7ujQXQ6PCWW9wB/Wl7VNIB3rE2oIOfNzCfyFQHuxWA1zjfQR3TqSDpsW5aaKziv2l2A8baJmlcPAFGRymP7RRPM87FgI85HMnnQYVf9ZbgiGNshvLPiBYDlGBlsJqJd6pwKfrMIVSnAzxuxQ/5wSfyWWbErGdXRk2MDwuu/yjWRYcW4CqoQYeWcR9BIw49xUKmsDyNnkGohpicJNJdghNA/23fD3o2EluAmEocjlsFZmgptKxfmnyzcabiojE7jp5BnIbmq4+beh42YIipMvMvkm3HDva93kGaiDvgc310b+yOS7cLMDbnCegTbfhJs1i/aNtfYOx3ddPxm05OFmzxC6C4d+mqvzhq67N0ggJ4cnRRAp9gZrItrAXkDiZPRr6plunBvH8936smvHxXNHa558rUdKZkKvr206q9l4xv4ejhpwma2np9bHMM6uk+S51jfh5DQhwMFI8VNoG7/Yu0NNLo+F0Y3CjspNo9oU6ac6ypJxS0fBVcNUgm9+vYlNupi9CTJhaRsIDZKCd0kWB9Nvkgti4ca2ijAIgMnJ2ZFRlo6bFUscLTN+7RKZVbTeBhUn6JC0y0CyYtUUbqhmVTUMk3QNN7r0TboTekOzEcm9gEwXHGSdcESJYqvbQm5MlGCBLAvdDZyKM+yRgZAcbzhzZBlo5JKT9Tk52TTz1RUENNw4IBDqxi6lnihMQYMqmTsaR2dVbrxBZ6HRvkWzaoXPGrE7JtJpd9Lk3HQJL/1NrdbDjC4jFk64hEUr1CYaWknvybvBVdwQK4k+xTiuwKbhBmpSKG5tujI1JPlGauhcS9jiHopzMyaTsKzwzylVLXW9TCgVVqNDVglXKKBLfVFDRKSOdKlnyuM4hBqj6ihDGtUUCvYiyQ1UGxLUUC6MnXRgxiQKrWCSGwgFJG7AjkXvcIASFp8xTlRiEVlXxqAxlS5yDENJhdkVWJiuuSnzJl7iah8BKYhz4/SZGUgsKJadK8veZReGZGi4YW5d4mYL3CzDA/Rvy1AegxPRA2dUsqdjUw3akXwPfYjKN6jnEfZY5Sawmyb1C6OEU6SPDEtgupktk9x0Y9ws44tMI3XVUlSLiciuiszpILaaQdeq3HVgK75OmWtBsZDjEDBuqo3RbDa7G38Q31xF066GYypg01YOTRWZgRu5XpzgpkJ9l1zsYtZFJYJyE0vk7rCqbfDcKGoZyvU59kw1oGeS4ZylOgrgxjIJMLZUISSwBYTqGpnF4juEmzqJORaSPwVuFAer4QZMbfjeGRXKqmNxELcolDg8ScpuNHTTSgfnxiBA8N8b3coE+YLksaYwcvUDuCGLVlms42O4YUsEz6QLhjQGhEDJS0oBx44p6YO9YYYkAHK0ZZtrjT1jFZtQVwfZ9iaOwTppXLK5gSWlBsKDGldp5hGa6knOTf66tWyL6zxa0ySMPMMyJWDYkBAuIS83vt2A0DkvNzDTPaa1B/VvVdDqGbip8C2ZpMnhJeQwRwI0CcLQ2M3Djd9haVX1CG5AFF2GRQH7PjgpZxPlTzlVHz7mleJE7gy7T7YGwhYPD7I3FL7NEvHx1gFrrjwskxse7sQTLA4WbuKxRs7ViXrDY4lk5cbNNmf+Ydx4hBiShe+21HaNj+DGzeYm5+7RXsS44XFUM5YxDLPNmX/ImnJGND9Hcz4z8OHKqIfqjRpOhJhj2XeeiHjOUONGQKWem/q0VP8QvXFNmmxGR4CbRFx8iL3ZY+H7OO7gT0Ai17zj5Kg8xDOhJIJsbnwWJEjL4RhuHCZKLEQPwYIf40xtLck8HLZ8LUsReWGkCMRwADeQGElZLHCjDJPtwxtgbvVS1I6N83RIchPodu6YfKnvI5ubWiLYnxtHcMOc277pB6mWOic0ta0uX1WyRVtmGuNsbvoJOzk9hptEpUMB0/ozbQXp6sUiypEfz1pIkg7AmYvITZPJxLhZx5cUrNS83IDBUcpsDB0mLgtfk6XuyuoIv67dgzF4BVtSk45ece6Q0N9sbiwr7mCuj+EGCo4JxfERU3RgLpH2kLP5DbSWmwFv55JtAytgxPPQLQrrAdncNOLq7mksxwHcQEBhGcp7cm4MeHG2zuI4DSM1ANEDnhMvNY+4PZ5GzmqpKSMvkRFq0l5uwkXEvJLxEc3xA7hRHCJTLrU2FeeG6zBeSDd6ayzCQbZ0Y7s2U5yvYYZBhHpxUnnvFrainA62DZrr6KErJL0NFvupCsgmFXnbDQwgiho1hJKRgad564xTpW43BnJuwsuWGIfvAEotFoqGdRs4b4ceGQbEJSPhrppe+uIEGofsgDIZaNep+4G/HGGE43EcmXn0MvnKjIrPUNVA192h725IIl7nutjzPQ9ucyCPtgxJS4TblHd+51yUSXcY+IPOlEgS3eHDFiDCoxo5627m5BXmjJQXH6JKwDhAqCGtIFGuYPn+R19ICdURvjdroAUntDYb8y1Jcvl8RIcZjddiBBNN+QY3FGz4/TdE5aoGXICoZV3252IUIs6ELgK3PzHEMORQtGJnop0VNnZRQ1Z8b8fOWnxHnOhUXielabqWV/61dFzYZG9GnmRxTUNG+MRRcpjYyHDd8IbvBGPepe2zrWEyFuWmp95Czf5WOwyFO0VNQ0hixo1JrSE20+mbGOcu3WxrcWxlbgLpfOQuvW7/Bt76naT27jYxTGxkceVmx+6eiM4HZ0XWVnXc9RKjsCqnHxNSln9oz0F/4x0dDIPRlFPc+dJO1cAPTuj/9E65OTFWkBKqp58tUaJEiRIlSpQoUaJEiRIlSpQoUXz8058xC5z/Y+wBQiZKtu8fDrt/3Nc5FL27rGLmcry/BzXC0KSTyLc9tep0NptNx069y5/jlCbYLGxRM7kzrX2MzWTpSLKsEJruv4EiQAf+uE4wzrt1t5nRUvO1nT51P/7hXB5sETqsHTxg7ZHmSFJRws0k4yaiD4fVyT2UexfGQ9XmAcMews34RtsstJkdXOTfGbEevlXyg5MY6nf8jo+btK4p2kCQvz3SyP7m6kBuJlkvORN9fHxHkZnxedSFuWlO8j48hlO4wegT9YZ+r0y8XL3blYxbUNvUAodzQ6+AfwOX+0Ov1tn6DjVyDuPGoY7ScQL6UfZg68H/w/GG3c42XGDDTafmucoainHDx4H/ePT27pALVRdXCJEqRnMVeel6pyO15ni1zdavnMDNhlrloMb2AcUbCCZobo/QwmDc9PleLtsJBuFs1LdnxBzS7yCQyTa1+9R0EznYhynOkO1gwmj+FPU6c9RnE3DmaGRPkLqBr3KzpPfSbWE2yMZjX4r3uRwNZogw3wTusI++EHfTW+JdbFNQ4Y3RlExibZ2ypsYYj/t+JdiJrhEiE9tKnRpcb64N2C4fmfAtwYYddxaI6pKzMyeO53nsuDHZBeSqOiWNd5i4sKU+A7e8Y007rtrLE19TXcTbmDoI96cDx+ubaHbd9ciJJgzqNQzKDXku8XAetGL0YJ/9A4gKuL5M8ncLSNwskRgNevoczN9q6MNXTeDG5V+yr8F/+nB0F37L7DA+tsigxxcmTMOAeQeMcJ/3HthK/JKwN4h/C0oGhN4+bMEjyZVwhd1E4lJuiwcIJtSBhoWGYPEkW0y4AcuATcaJjbj+eHFuBpybmyaQB98qzyVumByw+jk3XcQ/60TmXaSSnhJwJ7hphtzwwG1uApnEAoB3t1Gcmzn/Eb0Ba8zoih8kOM1PhdxUTdbhdG3wgHYvNyNkWr1wNrLeSDEo52aC19suwdZgnSMfGE0T3Q3Z3EwyuSEq1mcPshkZJKZ3xBBn5AaJb3r3clMZI7OJRNCVzs3aaMzuKGYzOgn/g2Y4U7XR8xzcDJGxu+MPWtLpGaFMX8tNZXBHszhwGvN0bnCsEXU7p81WSg+ezA3zx0dxozQP4s/hpiGGTeGmQnvOuCfOWlNyoyz48do1VpIEmRvWO3zcmpL53hkolOmM3BAfDH+H3NiqnxrwPtce9DTPTdF5rOOmE/FJZjXjLcYLRWCJmw37Xy5uxJBYtN86cP4EW2xpuGF6EIjIJOSGSBTwf6nkQ354AFHKDoueQEUOzg15n3yJ1hDNsGFqPeWD1IibAJ5k5uBGfFFbC2NX+vtCHuK94kdw46Pwm9Au4j3wTT7cBn5Sx18bnKSAtaA7vanBGqx9Hh6PwNeTwGzjeZReEohF8e4Hb20n1LMPHzb0apvbqIbSfn5t8E+XgzU0dEdvhy+Ua963TVY3xBczUaMgdyzh6XcI9Tz6q9Jr/lgaiQcLnPOTqgX8tBNdDC7rULweVia0lxYzjmvElaytBYvZWexFFgYyUJcdWBJuRiSnsHfcZrCj5Dpnwhol5xBCs7ZJ9vZd+rAqNN3a12PU7/TwLqpBuFyW9XrN+0HHtNO2uaEZPr1zW7E/II1Ysh7HaVDZLkLRINuZCSmxCFwrSzKf9cfHMNZkmollnYP+/Cz7j8eP8agPzi0H4tfA3Hp96VW8Jfv1L2dJ7iIQo/nkYp8eZiMswWyz//OVQv8LSur7FZfcKX/F7NVVwOVMEhjQp09nIwTiAb64FESrB9JQYYbr8NEGB/30WYkSJUqUuBD+Dyx8ZcattRrpAAAAAElFTkSuQmCC";
        description="Reliance Industries Limited is an Indian multinational conglomerate, headquartered in Mumbai. Its businesses include energy, petrochemicals, natural gas, retail, telecommunications, mass media, and textiles";
        strarr=new String[]{description,img};
        map.put("Reliance Industries Limited",strarr);
        img="data:image/png;base64,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";
        description="Airbnb, Inc. is an American San Francisco-based company operating an online marketplace for short- and long-term homestays and experiences. The company acts as a broker and charges a commission from each booking. The company was founded in 2008 by Brian Chesky, Nathan Blecharczyk, and Joe Gebbia.";
        strarr=new String[]{description,img};
        map.put("Airbnb",strarr);
        img="data:image/png;base64,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";
        description="Amazon.com, Inc. is an American multinational technology company focusing on e-commerce, cloud computing, online advertising, digital streaming, and artificial intelligence.";
        strarr=new String[]{description,img};
        map.put("Amazon",strarr);
        img="data:image/png;base64,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";
        description="eBay Inc. is an American multinational e-commerce company based in San Jose, California, that facilitates consumer-to-consumer and business-to-consumer sales through its website. eBay was founded by Pierre Omidyar in 1995 and became a notable success story of the dot-com bubble.";
        strarr=new String[]{description,img};
        map.put("eBay",strarr);
        img="data:image/png;base64,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";
        description="Ferrari S.p.A. is an Italian luxury sports car manufacturer based in Maranello, Italy. Founded by Enzo Ferrari in 1939 from the Alfa Romeo racing division as Auto Avio Costruzioni, the company built its first car in 1940, and produced its first Ferrari-badged car in 1947.";
        strarr=(String[])map.get(companyName);
        map.put("Ferrari",strarr);
        return strarr;
    }

    /**
     * This is a sample web service operation
     */
    
}
